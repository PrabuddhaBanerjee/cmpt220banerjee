//package lab3;


public class P1Triangle extends P1GeometricClass{
    private double side1,side2,side3;

    /**
     * Constructor for objects of class Triangle
     */
    public P1Triangle()
    {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
        
    }
    P1Triangle(double side1, double side2, double side3){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
    P1Triangle(double side1, double side2, double side3, String color, boolean filled){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      setColor(color);
      setFilled(filled);
    }
    public double getFirstSide(){
      return side1;
    }
    public double getSecondSide(){
      return side2;
    }
    public double getThirdSide(){
      return side3;
    }
    public double getArea()
    {
        double area = (side1+side2+side3)/2 ;
        area = area*(area-side1)*(area-side2)*(area-side3);
        return Math.sqrt(Math.abs(area));
    }
    public double getPerimeter()
    {
        double perimeter = side1 + side2 + side3 ;
        return perimeter;
    }
    public String toString()
    {
        
        return "Triangle: side1 = " + side1 + " units side2 = " + side2 +" units side3 = " + side3 +" units";
    }
}
