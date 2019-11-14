class Rectangle implements Printable{
    private int x;
    private int y;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    public int getlength(){
      return this.x;
    }
    public void setlength(int m){
      x = m ;
    }
    public int getWidth(){
      return this.y;
    }
    public void setWidth(int n){
      y = n ;
    }
    @Override
    public String print()
    {
        // put your code here
        return "Rectangle sides are:"+getlength()+" and "+getWidth();
    }
}
