public class Driver_bnd{
  public static void main(String[] args){
    Bond bnd = new Bond(500,5,10000,100);
    bnd.getParameters();
    System.out.println(" bond Value is:$"+bnd.getPrice());
  }
}
