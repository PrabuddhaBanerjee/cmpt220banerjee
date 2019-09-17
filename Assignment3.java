package test;
import java.util.Scanner;
public class JavaMyClass {
	double p;
	double pentagon(int n) {
		//System.out.println(n);
		//for (int i=n; i<0;i++) {
			p = ((Math.pow(n,2)*3)-n)/2;
			//System.out.println(n);
		//}
		
		return p;
	}
	
public static void main(String[] args) {
	int num;
	Scanner input = new Scanner(System.in);
	System.out.print("Hi");
	num = input.nextInt();
	JavaMyClass temp = new JavaMyClass();
	while(temp.pentagon(num)!=0) {
		System.out.println(temp.pentagon(num));
		num--;
	}
	//System.out.println(temp.pentagon(num));
	
	input.close();
}
}
