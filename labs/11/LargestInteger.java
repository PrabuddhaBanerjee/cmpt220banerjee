import java.util.Scanner;
public class LargestInteger
{
    // instance variables - replace the example below with your own
    private static int[] arr;
    static int  i=0;
    public static int largestNum(int[] y){
      if(y[i] > y[y.length-1]){
        int temp = y[i];
        y[i] = y[y.length-1];
        y[y.length-1] = temp;
        if(i<=y.length-1)
          i++;
        largestNum(y);
      }
      return y[y.length-1];
    }
    
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      arr = new int[8];
      for(int i=0 ; i<8; i++){
        if(i==0)
          System.out.println("Please enter numbers in array");
        else System.out.println("Please enter next number");
        arr[i] = input.nextInt();
      }
      System.out.println("The Largest integer of the array is "+largestNum(arr));
    }
}
