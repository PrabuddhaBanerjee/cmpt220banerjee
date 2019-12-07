import java.io.*;
import java.io.File;
import java.net.*;
import javax.sound.sampled.*;

class Server {
  private static int SOCKET_PORT= 13267;
  private static String FILE_TO_SEND = "Maroon.WAV";
  //public final int SOCKET_PORT ;  // you may change this
  //public final String FILE_TO_SEND ;  // you may change this

  public static void main(String[] args) throws IOException {
    FileInputStream fis = null;
    //BufferedInputStream bis = null;
    AudioInputStream bis = null;
    OutputStream os = null;
    ServerSocket servsock = null;
    Socket sock = null;
    try {
      servsock = new ServerSocket(SOCKET_PORT);
      while (true) {
        System.out.println("Waiting...");
        try {
          sock = servsock.accept();
          System.out.println("Accepted connection : " + sock);
          // send file
          File myFile = new File("C:/Users/dell/IdeaProjects/Project/src/Server/Maroon.WAV");//(int) myFile.length()
          byte[] mybytearray = new byte[1024];
          fis = new FileInputStream(myFile);
          bis = AudioInputStream.getAudioInputStream(myFile);
          // bis = new BufferedInputStream(fis);
          bis.read(mybytearray, 0, mybytearray.length);
          os = sock.getOutputStream();
          int len = 0;
          while((len=bis.read(mybytearray))!=-1){
            os.write(mybytearray, 0, len);
          }
          System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
          os.flush();
          System.out.println("Done.");
        } finally {
          if (bis != null) bis.close();
          if (os != null) os.close( );
          if (sock != null) sock.close();
        }
      }
    } finally {
      if (servsock != null) servsock.close();
    }
  }
  }
