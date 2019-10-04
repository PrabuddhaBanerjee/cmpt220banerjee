import java.util.Scanner;

public class Lab5Program3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please tell number of students in your class.");
		int count = input.nextInt();
		System.out.println("First Enter your Name and then your score.");
		String[] name = new String[count];
		double[] score = new double[count];
		for(int i=0; i<count; i++) {
			name[i] = input.next();
			score[i] = input.nextInt();
		}
		sort(name, score);
		
		for(int i=0; i<count; i++) {
			System.out.println(name[i]+"::"+score[i]);
		}
		
		input.close();
	}

	private static void sort(String[] name, double[] score) {
		double min=0, temp=0;
		String tempString="";
		int min_idx =0;
		for(int i=0; i<score.length; i++) {
			min = score[i];
			min_idx = i;
			for(int j=i+1; j<score.length; j++) {
				if(score[j]<min) {
					min = score[j];
					min_idx = j;
				}
				temp = score[i];
				tempString = name[i];
				score[i] = score[j];
				name[i] = name[j];
				score[j] = temp;
				name[j] = tempString;
					
			}
				
		}
		
	}
}
