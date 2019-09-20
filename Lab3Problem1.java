import java.util.Scanner;

public class Lab3Problem1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer, the input ends with a 0:");
		
		int countEven = 0;
		int total = 0, sum = 0;
		double avg;
		while(input.hasNextInt()) {
			int num = input.nextInt();
			if(!checkValid(num))
				break;
			else{
				//countisEven(num);
				if(num%2 == 0) {
					countEven++;
				}
				total++;
				sum = sum + num;
			}
			
		}
		avg = sum/total;
		System.out.println("The number of even numbers: "+countEven);
		System.out.println("The total sum: "+sum);
		System.out.println("The average is: "+avg);
		input.close();
	}
    
	private static boolean checkValid(int i) {
		if(i!=0) {
			 return true;
			}
		return false;
	}

}
