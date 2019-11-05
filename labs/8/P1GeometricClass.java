//package lab3;


public class P1GeometricClass
{
   private String color = "white";
   private boolean filled;
   P1GeometricClass(){
   }
   P1GeometricClass(String color, boolean filled){
     this.color = color;
     this.filled = filled;
   }
   public String getColor(){
     return color;
   }
   public void setColor(String color){
     this.color = color;
   }
   public boolean isFilled(){
     return filled;
   }
   public void setFilled(boolean filled){
     this.filled = filled;
   }
}
