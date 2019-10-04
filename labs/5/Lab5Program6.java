import java.util.Scanner;

public class Lab5Program6 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Please Enter size of the Matrix");
		  int num = input.nextInt();
		  double[][] arr = new double[num][num];
		  for(int row=0; row<num; row++) {
			    for(int col=0; col<arr[row].length;col++) {
				  System.out.print("Please enter "+"row "+(row+1) +" column "+(col+1)+" element of matrix");
				    arr[row][col] = input.nextInt();
				   }
		  }
		  System.out.println("Please enter the row for which you require average");
		  int row = input.nextInt();
		  System.out.println("The average is: "+averageRow(arr, row));
		  input.close();
	}
	public static double averageRow(double[][] array, int row) {
		double avg=0;
		for(int i=(row-1); i<row;i++) {
			for(int j=0;j<array.length;j++)
			avg += array[i][j];
		}
		
		return avg/array.length;
	}
}
