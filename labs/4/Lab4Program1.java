
public class Lab4Program1 {
  public static void main(String[] args) {
	  System.out.println("in\t cm| cm\t\t in");
	  System.out.println("----------------------------");
	  double valCm, valIn;
	  int check=0;
	  for(int i=1;i<=50;i++) {
		  valCm = (i*2.54*100)/100;
		  if(check==0)
		  check=i;
		  else check += 5;
		  valIn  = (check*0.39*100)/100;
		  System.out.println(i+"\t "+valCm+"|"+check+"\t  "+valIn);
	  }
   }
}
