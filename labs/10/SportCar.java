class SportCar implements Printable{
    private String model;
    private int carNumber;

    public SportCar(String model, int carNumber)
    {
        this.model = model;
        this.carNumber = carNumber;
    }
    public String getCar(){
      return this.model;
    }
    public void setCar(String m){
      model = m ;
    }
    public int getCarNum(){
      return this.carNumber;
    }
    public void setCarNum(int num){
      carNumber = num ;
    }
    @Override
    public String print()
    {
       return "The car is a "+ this.model +" and number of car is "+ this.carNumber;
    }
}
