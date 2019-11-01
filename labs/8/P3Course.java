package lab3;
import java.util.ArrayList;
public class P3Course{
    private String courseName;
    //private String[] students = new String[100];
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;
    
    public P3Course(String courseName){
      this.courseName = courseName;
    }

    public void addStudent(String student){
      students.add(student);
    }
    public void getStudent(){
      System.out.println(students.toString());
    }
    public int getNumberOfStudents(){
      return students.size();
    }
    public String getCourseName(){
      return courseName;
    }
    public void dropStudent(String student){
    	students.remove(student);
    }
    public void printAllStudents() {
    	System.out.println(students.toString());
    }
}
