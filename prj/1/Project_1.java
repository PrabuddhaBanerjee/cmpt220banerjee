package project;
import java.util.Scanner;
public class Project_1 {
  static int findDivisors(int n) {
    int sum=0;
	for (int i=2;i<Math.sqrt(n);i++){ 
	  if (n%i==0) {
	    sum += i +(n/i);
	  }
	}
	if((int)Math.sqrt(n)==Math.sqrt(n))
	  sum+= (int)Math.sqrt(n);
	int ch = sum;
	return ch+1;
  }  
  static void checkPerfect(int nm, int check) {
    int temp = Math.abs(check-nm);
    if((temp)==0) {
      System.out.println(check+" perfect");
    }
    else if((temp)<=2){
      System.out.println(check+" almost perfect");
    }
    else if((temp)>2) {
      System.out.println(check+" not perfect");
    }
  }
 
  public static void main(String args[]) { 
    int num;
    Scanner input = new Scanner(System.in);
    while(input.hasNextInt()) {
      num = input.nextInt();
      int checkNum =  findDivisors(num);
      checkPerfect(checkNum, num);
    }
    input.close();
  }  
}
