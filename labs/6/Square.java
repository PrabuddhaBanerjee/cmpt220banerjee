public class Square
{
    private double width;
    Square(){
      // initialise instance variables
      width = 1;
    }
    Square(double width){
      this.width =  width;
    }
    public double getPerimeter(){
      double perimeter = 4*width;
      return perimeter;
    }
    public double getArea(){
      double area = width*width;
      return area;
    }
    public double getWidth(){
    return this.width;
    }
}
