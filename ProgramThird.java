import java.util.Scanner;
public class ProgramThird {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter a value for ounces: ");
	//User Enters value for weight
	double weight = sc.nextDouble();
	System.out.println(weight+" ounces is "+(weight*28.3495));
	sc.close();
}
}
