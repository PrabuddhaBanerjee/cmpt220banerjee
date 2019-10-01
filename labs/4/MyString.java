import java.util.Scanner;
public class MyString {
	static String  palindromeWord = "";
	public static String reverse(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			palindromeWord = palindromeWord+ s.charAt(i);
		}
		return palindromeWord;
	}
	public static boolean isPalindrome(String s) {
		if(palindromeWord.equals(s))
		  return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String to check Palindrome");
		String word = input.nextLine();
		reverse(word);
		if(isPalindrome(word))
		  System.out.println("Input is a Palindrome");
		else  System.out.println("Input is not Palindrome");
		input.close();
	}
}
