import java.util.Scanner;
public class Lab3Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num;
		int sum=0;
		int total = 0;
		int avg;
				
		System.out.println("Enter a positive integer, the input ends with a 0:");
		num = input.nextInt();
		while(num!=0) {
			num = input.nextInt();
			sum+=num;
			System.out.println(sum);
		}
		avg = sum/total;
		System.out.println("The number of even numbers: "+count);
		System.out.println("The total sum: "+sum);
		System.out.println("The average is: "+avg);
		input.close();
	}

}
