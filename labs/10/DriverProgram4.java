import java.util.Arrays;
public class DriverProgram4{
  public static void main(String[] args){
    Appliance[] app = new Appliance[40];
    for (int i=0;(i/4)<10;){
      app[i] =new Toaster(220,"Black","China",(19.89+i),"Hamilton",240, 4 ); 
      app[(i+1)] =new TV(240,"Grey","Vietnam",(49.94+i+1),"Quadcore", true, true); 
      app[(i+2)] =new Telephone(100,"Blue","Indonesia",(300+i+2),true,10,22);
      app[(i+3)] =new Toaster(220,"Grey","USA",(14.29+(i*2)),"Murphy",240, 2 );
      i=i+4;
    }
    /*for (int index=0; index<app.length-1; index++) {
      //System.out.println(app[index].compareTo(app[index+1]));
    }*/
    Arrays.sort(app);
    for (int index=0; index<app.length; index++) {
      if(index % 4 == 0)
        System.out.print("Toaster ");
      else if(index%4 == 1)
        System.out.print("TV ");
      else if(index%4 == 2)
        System.out.print("Telephone ");
      else System.out.print("Toaster ");
      System.out.println(app[index]);
    }
  }
}
