import java.util.Scanner;
public class SumOfDigits
{
    private long number;
    private static int sum = 0;
    public static int sumDigits(long n){
      if(n==0)
        return 0;
      return (int)((n % 10) + sumDigits(n/10));
    }
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a number");
      sum = sumDigits(input.nextLong());
      System.out.println("Sum of digits is "+sum);
    }
}
