import java.util.Scanner;

public class Lab3Program5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 positive integer, to find thier average");
		double num1 = input.nextInt();
		double num2 = input.nextInt();
		double num3 = input.nextInt();
		System.out.println("Average is "+average(num1, num2, num3));
		input.close();
	}

	private static double average(double a, double b, double c) {
		double avg = (a+b+c)/3;
		
		return avg;
	}
}
