
public class Bond{
    // instance variables - replace the example below with your own
    private double coupon;
    private double interest;
    private double valueMaturity;
    private int payments;
    Bond(){
      coupon = 1;
      interest = 1;
      valueMaturity = 1;
      payments = 1;
      System.out.println("Default Bond value:"+getPrice());
    }
    Bond(double coupon, double interest, double valueMaturity, int payment){
      this.coupon = coupon;
      this.interest = interest;
      this.valueMaturity = valueMaturity;
      this.payments = payment;
    }
    public double getPrice(){
      double price = (coupon*(1-(1/Math.pow((1+interest),payments))))+(valueMaturity*(1/Math.pow((1+interest),payments)));
      return price;
    }
    public void getParameters(){
      System.out.print("For Coupon worth $"+this.coupon+", interest "+this.interest+"%, Maturity Value $"
                          +this.valueMaturity+" and payment $"+this.payments);
    }
}

