import java.util.Scanner;
public class Lab5Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double[] arr = new double[10];
		System.out.println("Enter 10 values for the Array.");
		double num;
		for(int i=0; i<10; i++) {
			num = input.nextInt();
			arr[i] = num;
		}
		System.out.println("The maximum value in your array is: "+max(arr));
        input.close();
	}

	private static double max(double[] array) {
		double max = 0;
		for(int j=0; j<array.length; j++) {
		if(max<array[j]) {
				max=array[j];
			}
		}
		return max;	
	}

}
