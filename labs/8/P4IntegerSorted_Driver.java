package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class P4IntegerSorted_Driver {
	 
    public static void main(String[] args) {
    	ArrayList<Integer> integersList = new ArrayList<>();
    	Scanner input = new Scanner(System.in);
    	Program4IntergerSorted numbers = new Program4IntergerSorted();
    	System.out.println("Please Enter 5 integers");
    	for(int i=0; i<5; i++) {
    		integersList.add(input.nextInt());
    	}
    	numbers.sort(integersList);
    	numbers.printArray(integersList);
    	input.close();
    }
}
