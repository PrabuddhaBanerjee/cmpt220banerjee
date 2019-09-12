import java.util.Scanner;

public class Pogram4Sep13 {
	public static void main(String[] args) {
		char char1, char2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first character: ");
		char1 = input.nextLine().charAt(0); 
		System.out.print("Enter second character: ");
		char2 = input.nextLine().charAt(0);
		System.out.print("Result is: "+(char1+char2));
		input.close();
		}
	}
	
