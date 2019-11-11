public class Driver{
  public static void main(String[] args){
    FirstSubClass f1 = new FirstSubClass();
    f1.printMessage();
    SecondSubClass f2 = new SecondSubClass();
    f2.printMessage();
  }
}
abstract class AbstractClass{
   public abstract void printMessage();
}
class FirstSubClass extends AbstractClass{
  @Override
  public void printMessage(){
    System.out.println("This is First SubClass");
  }
}
class SecondSubClass extends AbstractClass{
  @Override
  public void printMessage(){
    System.out.println("This is Second SubClass");
  }
}