
class Telephone extends Appliance
{
    private boolean internationalCall ;
    private int maxVolume;
    private int backup;
    Telephone(){
    }
    public Telephone(double voltage,String color, String madeIn,double price ,boolean internationalCall, int maxVolume,int backup  ){
      super( voltage, color,  madeIn, price); 
      this.internationalCall = internationalCall;
      this.maxVolume = maxVolume;
      this.backup = backup; 
    }
    public boolean isInternational(){
      return this.internationalCall;
    }
    public int getmaxVolume(){
      return this.maxVolume;
    }
    public int getbackup(){
      return this.backup;
    }
}
