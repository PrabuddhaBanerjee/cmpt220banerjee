import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Program4 {
  public static void main(String[] args) {
    File fl = new File(args[1]);
	ArrayList<String> al = new ArrayList<>();
	try {
	  Scanner fileInput = new Scanner(fl);
	  while(fileInput.hasNextLine()) {
	    String s1 = fileInput.nextLine();
		s1 = s1.replaceAll(args[0], "");
		al.add(s1);
	  }
	  fileInput.close();
	  PrintWriter pw = new PrintWriter(fl);
	  for (int i = 0; i < al.size(); i++)		
	    pw.println(al.get(i));
		pw.close();
		System.out.println("New modifed file is Ready");
	  } 
	catch (FileNotFoundException e) {
	  e.printStackTrace();
	}
  }	 
}
