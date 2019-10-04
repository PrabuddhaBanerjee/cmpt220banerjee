import java.util.Scanner;

public class Lab5Program5 {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Please Enter size of the Matrix");
		  int num = input.nextInt();
		  int[][] arr = new int[num][num];
		  
		  for(int row=0; row<num; row++) {
		    for(int col=0; col<arr[row].length;col++) {
			  System.out.print("Please enter "+"row "+(row+1) +" column "+(col+1)+" element of matrix");
			    arr[row][col] = input.nextInt();
			  }
		  }
		  for(int i = 0; i< arr.length; i++){
		    for(int col = 0 ;col< arr[i].length; col++){ 
		      System.out.print("\t"+arr[i][col]);
		    } 
		     System.out.println("\n");
		   }
		  System.out.println("Transpose of the Matrix is:");
		  for(int i = 0; i< arr.length; i++){
		       for(int col = 0 ;col<arr.length; col++){ 
		             System.out.print("\t"+arr[col][i]);
		       } 
		       System.out.println("\n");
		   }
		  input.close();
	  }
}
