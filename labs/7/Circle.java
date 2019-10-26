public class Circle
{
    private double x;
    private double y;
    private double radius;
    Circle(){
      // Initialize instance variables
      x = 0;
      y = 0;
      radius = 0;
    }
    Circle(double x, double y, double radius){
      // Initialize instance variables
      this.x = x;
      this.y = y;
      this.radius = radius;
    }
    public double getCenterXcoord(){
      return this.x;
    }
    public double getCenterYcoord(){
      return this.y;
    }
    public double getRadius(){
      return radius;
    }
    public double getArea(){
      return Math.PI * Math.pow(radius,2);
    }
    public double getPerimeter(){
      return 2*Math.PI *radius ;
    }
    public boolean contains(double x1, double y1){
      double check = Math.pow((Math.pow(x1-x,2)+Math.pow(y1-y,2)),0.5);
      if(check<radius)
        return true;
      else return false;
    }
    public boolean contains(Circle circle){//c>a+b
      double check = (Math.pow((Math.pow(this.x-circle.x,2)+Math.pow(this.y-circle.y,2)),0.5))+circle.radius;
	 // return circle.contains(circle.x,circle.y);
    	return this.radius> check;
    }
    public boolean overlaps(Circle circle){
    	double a =Math.pow((Math.pow(this.x-circle.x,2)+Math.pow(this.y-circle.y,2)),0.5);
    
      return a < (this.radius) + (circle.radius);
    }
    
    
}
