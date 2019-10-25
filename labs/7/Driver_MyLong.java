import java.util.Scanner;
class Driver_MyLong{
public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please Enter a Long Value:");
	    long num = input.nextLong();
	    MyLong numbers = new MyLong(num);
		System.out.println("Is it even number:"+numbers.isEven());
		System.out.println("Is it Odd number:"+numbers.isOdd(num));
		System.out.println("Is it Prime number:"+numbers.isPrime(numbers));
		System.out.println("Array of charachters{'1','2','3'}");
		char[] a = new char[] {'1','2','3'};
	    numbers.parseLong(a);
	    String str = "456";
	    numbers.parseLong(str);
	    input.close();
	  }
}