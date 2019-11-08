import java.util.Scanner;

public class Lab9Program1 {

	public static void main(String[] args) {
		int[] random = new int[100];
		Scanner input = new Scanner(System.in);
        for(int i=0; i<100; i++) {
          random[i] =(int)(Math.random()*101);
        }
		System.out.println("Random Numbers are generated.");
		try {
	      System.out.println("Please enter an integer for which you want to check value");
	      int num = input.nextInt();
	      System.out.println(random[num]);
		}
		catch(Exception NullPointerOutOfBound) {
			System.out.println("Out of Bounds");
		}
		
		input.close();
	}

}
