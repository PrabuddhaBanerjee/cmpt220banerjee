import java.io.*;
import javax.sound.sampled.AudioFileFormat;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Client {
    public final static int SOCKET_PORT = 13267;      // you may change this
    public final static String SERVER = "127.0.0.1";  // localhost
    public final static String
            FILE_TO_RECEIVED = "Maroon1.WAV";  // you may change this, I give a
    // different name because i don't want to
    // overwrite the one used by server...

    public final static int FILE_SIZE = 32869; // file size temporary hard coded
    // should bigger than the file to be downloaded

    public static void main (String [] args ) throws IOException {
        int bytesRead;
        int current = 0;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        Socket sock = null;
        try {
            sock = new Socket(SERVER, SOCKET_PORT);
            System.out.println("Connecting...");

            // receive file
            byte[] mybytearray = new byte[FILE_SIZE];
            InputStream is = new BufferedInputStream(sock.getInputStream());

           /* fos = new FileOutputStream(FILE_TO_RECEIVED);
            //bos = new BufferedOutputStream(fos);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            bytesRead = is.read(mybytearray, 0, mybytearray.length);
            current = bytesRead;

            System.out.println("bytesRead" + mybytearray.length + " " + current);
            //M1
           /*do {
                bytesRead = is.read(mybytearray, current, (mybytearray.length-current));
                if(bytesRead >= 0)
                    current += bytesRead;
                //System.out.println("bytesRead"+bytesRead+" "+current) ;

            } while(bytesRead > -1);*/
            //System.out.println("In Do1") ;
            //M2
            /*double L1 = 44100.0/240.0;
            double L2 = 44100.0/245.0;
            for (int i=0; i<mybytearray.length; i++) {
                mybytearray[i] = (byte)(55*Math.sin((i/L1)*Math.PI*2));
                mybytearray[i] += (byte)(55*Math.sin((i/L2)*Math.PI*2));
            }*/
            //M3
            /*while( (current = inStream.read(mybytearray, 0, mybytearray.length)) != -1){
                outStream.write(mybytearray, 0, read);
            }
            outStream.flush();
            byte[] audioBytes = outStream.toByteArray();

            writeWave(audioBytes);*/
           // bos.write(mybytearray);
            //bos.flush();
          //  System.out.println("File " + FILE_TO_RECEIVED
           //         + " downloaded (" + current + " bytes read)");
            //M2 part
          //  AudioFormat frmt= new AudioFormat(44100,8,1,true,false);
          //  AudioInputStream ais = new AudioInputStream( new ByteArrayInputStream(mybytearray), frmt,mybytearray.length);
            //AudioSystem.write(ais, AudioFileFormat.Type.WAVE,new File("Maroon.wav"));
           //System.out.println(FILE_TO_RECEIVED);
            SimpleSoundPlayer sound = new SimpleSoundPlayer(is);
           //InputStream stream = new ByteArrayInputStream(sound.getSamples());
            EchoFilter filter = new EchoFilter(150, .1f);
            InputStream stream = new FilteredSoundStream(is, filter);
            sound.play(stream);
            System.exit(0);
        }

        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if (fos != null) fos.close();
            if (bos != null) bos.close();
            if (sock != null) sock.close();
            //outstream.close();
        }
    }/*
    public void writeWave(byte[] audioArry) {

        String filePath = "new .wav path";

        AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.ULAW, 8000, 8, 1, 1, 8000, false);

        try {

            ByteArrayInputStream inStream = new ByteArrayInputStream(audioArry);
            long length = (long)(audioArry.length / audioFormat.getFrameSize());
            AudioInputStream audioInputStreamTemp = new AudioInputStream(inStream, audioFormat, length);


            File fileOut = new File(filePath);

            if (AudioSystem.isFileTypeSupported(AudioFileFormat.Type.WAVE, audioInputStreamTemp)) {
                System.out.println("Trying to write");
                AudioSystem.write(audioInputStreamTemp, AudioFileFormat.Type.WAVE, fileOut);
                System.out.println("Written successfully");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }*/
}
