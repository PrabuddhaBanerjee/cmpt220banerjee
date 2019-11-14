
public abstract class Employee{
  double age;
  double hourRate;
  String name;
  
  public abstract double salary(double hours);
  public void setName(String name){
    this.name = name;
  }
  public void setAge(double age){
    this.age = age;
  }
  public void setHourlyRate(double hourRate){
    this.hourRate = hourRate;
  }
  public String toString(){
        return "name= " + name + " age=" + age + " hourRate="+ hourRate;
  }
}

