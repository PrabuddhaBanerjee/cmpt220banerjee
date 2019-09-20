
public class Lab3Program3 {
	public static void main(String[] args) {
		String str =null;
		for(int i=1; i<=100;i++) {
			if(i%21==0) {
				System.out.print("\n");
			}
			else {
			str = Character.toString((char)i);
            System.out.print(str+" ");
			}
		}
	}
}
