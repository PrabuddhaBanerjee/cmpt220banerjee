
public class TV extends Appliance{
    private String processor;
    private boolean bluetooth;
    private boolean hotspot;
    TV(){
    }
    public TV(double voltage,String color, String madeIn,double price, String processor,boolean bluetooth, boolean hotspot ){
      super( voltage, color,  madeIn, price); 
      this.processor = processor;
      this.bluetooth = bluetooth;
      this.hotspot = hotspot;
    }
    
    public String getProcessor(){
      return this.processor;
    }
    public boolean getBluetooth(){
      return this.bluetooth;
    }
    public boolean getHotspot(){
      return this.hotspot;
    }
}
