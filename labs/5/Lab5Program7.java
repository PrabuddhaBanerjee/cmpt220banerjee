import java.util.Scanner;

public class Lab5Program7 {
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
		  System.out.println("Is the matrix in Uppertriangular matrix? "+isUpperTriangular(arr));
		  input.close();
	}
	public static boolean isUpperTriangular(double[][] array) {
		int count=0;
		 for(int i = 1; i< array.length; i++){
		       for(int col = 0 ;col<i; col++){ 
		            if(array[i][col]!=0)
		            	count++;
		       } 
		  }
		 if(count==0)
		return true;
		 else return false;
	}
}
