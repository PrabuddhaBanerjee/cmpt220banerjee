package lab3;
import java.util.Scanner;
public class P3Course_Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean stdName = true;
		
		System.out.println("Please Enter the course you want to study");
		String course = input.nextLine();
		P3Course cr = new P3Course(course);
		System.out.println("Please Enter the name of student who wants to study");
		String name = input.nextLine();
		cr.addStudent(name);
		 System.out.println("Is there anybodyelse who wants to study the same course (true/false)");
		  Scanner check = new Scanner(System.in);
		  stdName = check.nextBoolean();
		 if(stdName == true) {
		    System.out.println("Please Enter the name of next student who wants to study");
		    Scanner input2 = new Scanner(System.in);
		   	name = input2.nextLine();
		    cr.addStudent(name);
		    input2.close();
		  }
		System.out.println("Total size of class is: "+ cr.getNumberOfStudents());
		/*System.out.println("Please Enter the name of student who wants to drop");
		String dropname;
		 Scanner drp = new Scanner(System.in);
		 if(drp.hasNext()) {
	     dropname =drp.nextLine();
		 cr.dropStudent(dropname);
		 }*/
		System.out.print("Students who are studying are:"); 
		cr.printAllStudents();
		 check.close();
		// drp.close();
		 input.close();
	}

}
