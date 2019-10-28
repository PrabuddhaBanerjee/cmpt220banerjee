import java.util.Scanner;
public class Lab4Program8 {
	static int[] arr = new int[100];
	//static int[] arrCheck = new int[100];
	private static int temp;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer, the input ends with a 0:");
		int num;
		num=input.nextInt();
		for(int i=0; i<100;i++) {
			num = input.nextInt();
			if(num==0)
				break;
			else {
				if(num>0) {
					for(int j=0;j<i+1;j++) {
						arr[j]=num;
					}
				}
				else
					System.out.println("Please enter Positive integers");
				}
				
			}
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
				}
					
			}
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
