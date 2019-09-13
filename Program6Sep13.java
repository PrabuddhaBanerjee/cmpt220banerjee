
public class Program6Sep13 {
 public static void main(String[] args) {
	 int rand1, rand2, rand3;
	 int range1, range2, range3;
	 
	 range1 = 999 - 200;
	 range2 = 999 - 0;
	 range3 = 9999 - 0;
	 rand1 = (int)(Math.random()*range1)+200;
	 rand2 = (int)(Math.random()*range2)+0;
	 rand3 = (int)(Math.random()*range3)+0;
	 
	 System.out.println("("+rand1+") "+rand2+"-"+rand3);
	 }
}
