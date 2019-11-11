import java.util.Scanner;

public class Lab9Program3 {
	public static  void bin2Dec(String binaryString){
	  try {
	    int decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal); 
	  }
      catch(Exception NumberFormatException) {
	    System.out.println("Number not in format");
	  }
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Binary String");
		String get = input.nextLine();
		bin2Dec(get);
		input.close();
	}
}
