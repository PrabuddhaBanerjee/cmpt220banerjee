import java.util.Scanner;
public class ProgramFourth {
	public static void main(String[] args) {
		final double speed = 299972458;
		double mass, relativity; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mass m (in kgs) for the Theory of Relativity: ");
		//User Enters the value of mass in Kgs
		mass = input.nextDouble();
		//Relativity is calculated
		relativity = mass* Math.pow(speed, 2);
		System.out.println("For E=m * c^2 answer is:"+relativity);
		input.close();
	}
}
