public class Managr implements Printable{
    // instance variables - replace the example below with your own
    private long salary;
    private String name;

    public Managr(String name, long salary)
    {
        // initialise instance variables
        this.salary = salary;
        this.name = name;
    }
    public long getSalary(){
      return this.salary;
    }
    public void setSalary(long m){
      salary = m ;
    }
    public String getName(){
      return this.name;
    }
    public void setName(String n){
      name = n ;
    }
    @Override
    public String print()
    {
        // put your code here
        return "Manager's name" +getName()+" and "+getSalary();
    }
}
