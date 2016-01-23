package exer.fibonacci;

import java.math.BigInteger;

public class Fibonacci2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100; // the first n numbers, change or use Scanner as necessary
		long t1 = System.nanoTime();
		BigInteger[] series = extractSeries(n);
		long t2 = System.nanoTime();
		System.out.println("time spent = " + (t2-t1));
		for(int i=0; i<series.length ;i++){
				System.out.print(series[i] + " ");
		}

	}

	private static BigInteger[] extractSeries(int n) {
		BigInteger[] series = new BigInteger[n];
		int i = 0;
		while(i != n){
			series[i] = fibonacci(i++);
		}
		return series;
	}
	
	private static BigInteger fibonacci(int n){
		if(n==0)
			return BigInteger.ZERO;
		if(n==1)
			return BigInteger.ONE;
		else return (fibonacci(n-1).add(fibonacci(n-2)));
	}

}
