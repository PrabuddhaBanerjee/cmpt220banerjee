public class Driver_sq
{
    public static void main(String[] args){
      Square obj1 = new Square(35.9);
      System.out.println("The width of the square 1 is: "+obj1.getWidth()+" units");
      System.out.print("Its Perimeter is:"+obj1.getPerimeter()+" units");
      System.out.println(" and its Area is:"+obj1.getArea()+" units");
      Square obj2 = new Square(40);
      System.out.println("The width of the square 2 is: "+obj2.getWidth()+" units");
      System.out.print("Its Perimeter is:"+obj2.getPerimeter()+" units");
      System.out.println(" and its Area is:"+obj2.getArea()+" units");
    }
}
