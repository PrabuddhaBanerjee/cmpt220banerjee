import java.io.*;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioFileFormat;
import java.io.ByteArrayInputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.DataInputStream;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.LineUnavailableException;
/**
 * The SimpleSoundPlayer encapsulates a sound that can be opened from the file
 * system and later played.
 */

class SimpleSoundPlayer {

  public static void main(String[] args) {
    // load a sound
    SimpleSoundPlayer sound = new SimpleSoundPlayer("C:/Users/dell/JavaProject/Maroon.WAV");

    // create the stream to play
    InputStream stream = new ByteArrayInputStream(sound.getSamples());

    // play the sound
    sound.play(stream);

    // exit
    System.exit(0);
  }

  private AudioFormat format;
 //private AudioFileFormat format;

  private byte[] samples;

  /**
   * Opens a sound from a file.
   */
  public SimpleSoundPlayer(String filename) {
    try {
      // open the audio input stream
      AudioInputStream stream = AudioSystem.getAudioInputStream(new File(filename));
      format = stream.getFormat();
      // get the audio samples
      samples = getSamples(stream);
    }
    catch (UnsupportedAudioFileException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
  public SimpleSoundPlayer(InputStream is) throws UnsupportedAudioFileException, LineUnavailableException,
          IOException{
    try {

      //read audio data from whatever source (file/classloader/etc.)
      //InputStream audioSrc = getClass().getResourceAsStream(is);
      //add buffer for mark/reset support
      //InputStream bufferedIn = new BufferedInputStream(audioSrc);
      // open the audio input stream
      AudioInputStream stream = AudioSystem.getAudioInputStream(is);
      //format = stream.getFormat();
      // get the audio samples
      //samples = getSamples(stream);
      Clip clip = AudioSystem.getClip();
      clip.open(stream);
      clip.start();
      //samples = getSamples(is);
    }
    catch (UnsupportedAudioFileException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
  /**
   * Gets the samples of this sound as a byte array.
   */
  public byte[] getSamples() {
    return samples;
  }

  /**
   * Gets the samples from an AudioInputStream as an array of bytes.
   */
  private byte[] getSamples(AudioInputStream audioStream) {
    // get the number of bytes to read
    int length = (int) (audioStream.getFrameLength() * format
        .getFrameSize());

    // read the entire stream
    byte[] samples = new byte[length];
    DataInputStream is = new DataInputStream(audioStream);
    try {
      is.readFully(samples);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // return the samples
    return samples;
  }

  /**
   * Plays a stream. This method blocks (doesn't return) until the sound is
   * finished playing.
   */
  public void play(InputStream source) {
      SourceDataLine line;
      try {
    // use a short, 100ms (1/10th sec) buffer for real-time
    // change to the sound stream
      AudioFileFormat format1;
      format1 = AudioSystem.getAudioFileFormat(source);
      format = format1.getFormat();
    //int bufferSize = format1.getFrameSize()
     //   * Math.round(format1.getSampleRate() / 10);
    //byte[] buffer = new byte[bufferSize];

    // create a line to play to


      DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
      line = (SourceDataLine) AudioSystem.getLine(info);
      //line.open(format1, bufferSize);
        line.open(format);
    } catch (Exception ex) {
      ex.printStackTrace();
      return;
    }

    // start the line
    line.start();

   /* // copy data to the line
    try {
      int numBytesRead = 0;
      while (numBytesRead != -1) {
        //numBytesRead = source.read(buffer, 0, buffer.length);

        if (numBytesRead != -1) {
          line.write(buffer, 0, numBytesRead);
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }*/

    // wait until all data is played, then close the line
    line.drain();
    line.close();

  }

}
