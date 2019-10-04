import java.util.Scanner;
public class Lab5Program4 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the number of values for each array");
	  int num1 = input.nextInt();
	  
	  int[] setOne,setTwo;
	  setOne = new int[num1];
	  
	 for(int i=0; i<num1;i++) 
		 setOne[i]=input.nextInt();

	  int num2 = input.nextInt();
	   setTwo = new int[num2];
	  
      for(int j=0; j<num2;j++)
    	 setTwo[j]=input.nextInt();
     if(equal(setOne,setTwo)==true)
	  System.out.println("Arrays are identical");
     else System.out.println("The arrays are not identical");
	  input.close();
	  
  }
  public static boolean equal(int[] x, int[] y) {
	  int count=0;
	  for(int i=0; i<x.length; i++) {
		  for(int j=0; j<x.length; j++) {
			//  System.out.println("i="+i+" "+x[i]+"::"+"j="+j+" "+y[j]);
			if(x[i] == y[j]) {
				count++;
				break;
			}
				
		  }
	  }
	  if(count>=x.length)
		  return true;
	  else return false;
  }
}
