public class Toaster extends Appliance
{
    private String company;
    private int power;
    private int sliceCapacity;
    Toaster(){
      
    }
    public Toaster(double voltage,String color, String madeIn,double price,String company,int power, int sliceCapacity){
      super( voltage, color,  madeIn, price); 
      this.company = company;
      this.power = power;
      this.sliceCapacity = sliceCapacity;
    }
    
    public String getCompany(){
      return this.company;
    }
    public int getPower(){
      return this.power;
    }
    public int getsliceCapacity(){
      return this.sliceCapacity;
    }
   
}
