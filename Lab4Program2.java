
public class Lab4Program2 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				//To print Random Characters with a space
				System.out.print((char)((char)(Math.random()*26)+97)+"\t");
				}
			//For printing in next line
			System.out.println();
		}
		
	}

}
