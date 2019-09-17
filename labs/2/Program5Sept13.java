import java.util.Scanner;

public class Program5Sept13 {
	public static void main(String[] args) {
		String char1, char2;
		int stringLength;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String1 characters: ");
		char1 = input.nextLine();
		System.out.print("Enter String2 characters: ");
		char2 = input.nextLine();
		input.close();  //Closing Input
		//Checking String length
		if(char1.length()>char2.length()) {
			stringLength = char2.length();
		}
		else if(char2.length()>char1.length()) {
			stringLength = char1.length();
		}
		else stringLength = char1.length();
		
		//Comparing the String Characters for lexicographically print
		for(int i=0; i<=(stringLength-1);i++) {
			
			if(((int)char2.charAt(i))>((int)char1.charAt(i))){
				System.out.println(char1 +" "+char2);
				return;
			}
			else if((int)char2.charAt(i)<(int)char1.charAt(i)) {
				System.out.println(char2 +" "+char1);
				return;
			}
			
			else {
				if(i==(stringLength-1)) {
					if(char2.length()>char1.length()) {
						System.out.println(char1 +" "+char2);
					}
					else System.out.println(char2 +" "+char1);
				}
				else continue;
			}
		}
	}	
}
