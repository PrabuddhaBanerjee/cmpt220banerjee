
public class Lab4Program6 {

	public static void main(String[] args) {
	int[] arr1 = new int[11];
	addMethod(arr1);
	System.out.println("Initial Array:");
	for(int i=0; i<=10; i++)
		System.out.println(arr1[i]);
	insertMethod(arr1);
	System.out.println("Final Array:");
	for(int i=0; i<=10; i++)
		System.out.println(arr1[i]);
	}

	private static void insertMethod(int[] arr1) {
		for(int i=0; i<=10; i++) {
			if(i==2)
			  arr1[2]=10;
			if(i==6)		
			  arr1[6]=100;
		}
			
	}

	private static void addMethod(int[] arr1) {
		for(int i=0;i<11;i++) {
			if(i==arr1.length-1)
				arr1[i]=-1;
			else arr1[i]=i+1;
		}
		
		
	}

}
