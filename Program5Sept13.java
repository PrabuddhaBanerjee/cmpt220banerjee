import java.util.Scanner;

public class Program5Sept13 {
	public static void main(String[] args) {
		String char1, char2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String1 characters: ");
		char1 = input.nextLine();
		System.out.print("Enter String2 characters: ");
		char2 = input.nextLine();
		if(char2.charAt(0)>char1.charAt(0)) {
			  System.out.println(char1 +" "+char2);
			}
		else if(char2.charAt(0)==char1.charAt(0)) {
			for(int i=1; i<char1.length();i++) {
				if(char2.charAt(i)>char1.charAt(i)){
					 System.out.println(char2 +" "+char1);	
				}
						
			}
		}
		
			
		input.close();
	}	
}
