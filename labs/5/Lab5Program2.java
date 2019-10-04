import java.util.Scanner;

public class Lab5Program2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 10 values for the Mean and Array.");
		double[] arr = new double[10];
		for(int i=0; i<10; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("The Mean of the numbers is:"+mean(arr)+" and the standard deviation is: "+deviation(arr));
		input.close();
	}

	private static double deviation(double[] x) {
		double sum=0, mean=0;
		mean = mean(x);
		for(int i=0; i<x.length; i++) {
			sum+=Math.pow(x[i]-mean,2);
		}
		return Math.sqrt(sum/(x.length-1));
	}
	public static double mean(double[] x){
		double sum=0;
		for(int i=0; i<x.length; i++) {
			sum+=x[i];
		}
		return sum/x.length;
	}
}
