
class Manager extends Employee{
  
  public Manager(String name,double age,double hourRate){
    this.name = name;
    this.age = age;
    this.hourRate = hourRate;
  }
  @Override
  public double salary(double hours){
    return hourRate;
  }
}

