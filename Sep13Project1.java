import java.util.Scanner;
public class Sep13Project1 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter Number corresponding to number1:");
		num1 = input.nextInt();
		System.out.print("Please enter Number corresponding to number2:");
		num2 = input.nextInt();
		System.out.println(num1+" is LESS THAN "+num2+"? "+(num1<num2));
		System.out.println(num1+" is LESS THAN OR EQUAL to "+num2+"? "+(num1<=num2));
		System.out.println(num1+" is EQUAL "+num2+"? "+(num1==num2));
		System.out.println(num1+" is NOT EQUAL "+num2+"? "+(num1!=num2));
		System.out.println(num1+" is GREATER THAN "+num2+"? "+(num1>num2));
		System.out.println(num1+" is GREATER THAN OR EQUAL to"+num2+"? "+(num1>=num2));
		input.close();
	}

}
