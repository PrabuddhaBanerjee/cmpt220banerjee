import java.util.Scanner;
public class DriverTriangle
{
  public static void main(String[] args){
          double a,b,c;
          String color;
          boolean fill;
          Scanner input = new Scanner(System.in);
          System.out.println("Please enter First Side of triangle");
          a = input.nextDouble();
          System.out.println("Please enter Second Side of triangle");
          b = input.nextDouble();
          System.out.println("Please enter Third Side of triangle");
          c = input.nextDouble();
          System.out.println("Please enter color of triangle");
          color = input.next();
          System.out.println("Please enter filling state (true/false) of triangle");
          fill = input.nextBoolean();
          
          try{
            Triangle t1 = new Triangle(a,b,c, color,fill);
            System.out.println("A triangle"+t1.toString());
            System.out.println("the triangle color"+t1.getColor());
            System.out.println("the triangle first side"+t1.getFirstSide());
            System.out.println("the triangle second side"+t1.getSecondSide());
            System.out.println("the triangle third side"+t1.getThirdSide());
            System.out.println("the triangle area"+t1.getArea());
            System.out.println("the triangle perimeter"+t1.getPerimeter());
          }
          catch(Exception e){
            System.out.println("The enterd Triangle with given sides cannot be formed");
          }
          
          
        }
}
