package Question8_1;

public class Fibonacci_Memoization {
	public static int max = 100;
	public static int[] fib = new int[max];
	public static int fibonacci(int i){
		if(i==0){
			return 0;
		}
		if (i == 1){
			return 1;
		}
		if (fib[i]!=0){
			return fib[i];
		}
		fib[i] = fibonacci(i-1)+fibonacci(i-2);
		return fib[i];
	}
	
	public static void main(String[] args){
		int trials = 10;
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
