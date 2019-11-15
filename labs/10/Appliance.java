
public class Appliance implements Comparable<Appliance>{
    // instance variables - replace the example below with your own
    private double voltage;
    private String color;
    private String madeIn;
    private double price;
    Appliance(){
        
    }
    public Appliance(double voltage,String color, String madeIn,double price ){
      this.voltage = voltage;
      this.color = color;
      this.madeIn = madeIn;
      this.price = price;
    }
    public double getVoltage(){
      return this.voltage;
    }
    public String getColor(){
      return this.color;
    }
    public String getMadeIn(){
      return this.madeIn;
    }
    public double getPrice(){
      return Math.round(this.price*100.0)/100.0;
    }
    public void setVoltage(double pc){
       this.price = pc ;
    }
    public int compareTo(Appliance p){
      if(getPrice()>p.getPrice())
        return 1;
      else if(getPrice()<p.getPrice())
        return -1;
      else return 0; 
    }
    public String toString(){
      return "Price $"+getPrice();
    }
}
