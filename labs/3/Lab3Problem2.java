public class Lab3Problem2 {
	public static void main(String[] args) {
		int[] num =new int[114];
		int j=0;
		for(int i=100; i<=500;i++) {
			if((i%5==0)&& (i%7==0)) {
			continue;	
			}
			else if(i%5 == 0) {
				num[j++] = i;
			}
			else if(i%7 == 0) {
				num[j++] = i;
			}
		}
		System.out.println("numbers from 100 to 500 that are divisible by 5 or 7 but not both are");
		for(int k = 0; k<num.length;k++) {
			if(k%11==0){
				System.out.print("\n");
			}
			else System.out.print(num[k]+" ");
			
		}
	}
}
