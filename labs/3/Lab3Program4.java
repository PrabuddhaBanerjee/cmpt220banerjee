public class Lab3Program4 {
	public static void main(String[] args) {
		int flag=0;
		System.out.println("Program to find largest Prime Number");
		for(int i=1500; i>0; i--) {
			for(int j=2; j<=i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
				else {
					System.out.println(i);
					return;
				}
					
			}
		}
			
	}
}
