package Question8_1;

public class Fibonacci {
	public static int fibonacci(int i){
		if(i==0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		return fibonacci(i-1)+fibonacci(i-2);
	}
	
	public static void main(String[] args){
		int trials = 10;
		int max = 35;
		double [] times =  new double[max];
		
		for (int j = 0; j < trials; j++){
			for(int i = 0; i < max; i++){
				long start = System.currentTimeMillis();
				fibonacci(i);
				long end = System.currentTimeMillis();
				Long time = end - start;
				times[i] += time;
			}
		}
		for(int j=0; j< max; j++){
			System.out.println(j + ": " + times[j] / trials + "ms");
		}
	}
}
