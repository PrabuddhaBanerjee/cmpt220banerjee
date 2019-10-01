public class Lab4Program5 {
	public static void main(String[] args) {
		int sum = 0, lessAvg=0, greaterAvg=0, total_num=0;
		int[] numbers = new int[1000];
		for(int i=0; i<1000;i++) {
			int num = (int)((Math.random()*999)+1);
			sum += num;
			total_num++;
			numbers[i]=num;
		}
		int avg = sum/total_num;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>=avg)
				greaterAvg++;
			else lessAvg++;
		}
		System.out.println("Count of numbers less than avg is "+lessAvg+
				          " & more than average is "+greaterAvg);
	}

}
