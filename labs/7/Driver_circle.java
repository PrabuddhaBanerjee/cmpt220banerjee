class Driver_circle{
  public static void main(String[] args) {
    	Circle c1 = new Circle(2,2,5.5);
    	System.out.println("Area of Circle c1:"+c1.getArea()+" sq units");
    	System.out.println("Perimeter of Circle c1:"+c1.getPerimeter()+" units"); 
    	System.out.println("Does c1 circle contains circle (3, 3)?"+c1.contains(3, 3));
    	System.out.println("Does c1 circle contains Circle(4, 5, 10.5)?"+c1.contains(new Circle(4, 5, 10.5)));
    	//2 Methods for doing a same thing
      //System.out.println("Does c1 circle overlaps Circle(3, 5, 2.3)?"+c1.overlaps(new Circle(3, 5, 2.3)));
    	Circle case3Circle = new Circle(3, 5, 2.3);
      System.out.println("Does c1 circle overlaps Circle(3, 5, 2.3)?"+c1.overlaps(case3Circle));
    }
}
