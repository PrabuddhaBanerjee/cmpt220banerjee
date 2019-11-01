package lab3;
import java.util.ArrayList;
import java.util.Scanner;
public class Program4IntergerSorted
{
	 public Program4IntergerSorted(){
      }

    public void sort(ArrayList<Integer> list){
    	for (int i = 0; i < list.size(); i++) {
    	    for (int j = list.size() - 1; j > i; j--) {
    	        if (list.get(i) > list.get(j)) {
    	            int tmp = list.get(i);
    	            list.set(i,list.get(j));
    	            list.set(j,tmp);
    	        }
    	    }
    	}
    }
    public void printArray(ArrayList<Integer> list) {
    	System.out.println("The Sorted Array is:");
    	for(int i=0; i< list.size(); i++) {
    		System.out.println(list.get(i));
    	}
    }
   
}
