import java.util.Scanner;

public class Program3Sep13 {
	public static void main(String[] args) {
		int lowerLimit, upperLimit;
		int random_num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer for lower Limit:");
		lowerLimit = input.nextInt();
		System.out.print("Enter the integer for Upper Limit:");
		upperLimit = input.nextInt();
		for(int i=1; i<4; i++){
			random_num =(int) (Math.random()*(upperLimit-lowerLimit)) +lowerLimit;
			System.out.println("Random integer "+i+" is "+random_num);
		}
		input.close();
		
	}
}
