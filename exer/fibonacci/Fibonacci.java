package exer.fibonacci;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 2; // the first n numbers, change or use Scanner as necessary
		long t1 = System.nanoTime();
		BigInteger[] series = fibonacci(n);
		long t2 = System.nanoTime();
		System.out.println("time spent = " + (t2 - t1));
		for (int i = 0; i < series.length; i++) {
			System.out.print(series[i] + " ");
		}
	}

	private static BigInteger[] fibonacci(int n) {

		if (n < 0)
			throw new IllegalArgumentException();

		BigInteger[] nArray = new BigInteger[n+1];
		nArray[0] = BigInteger.ZERO;
		nArray[1] = BigInteger.ONE;
		for (int i = 2; i < n+1; i++) {
			BigInteger sum = nArray[i-1].add(nArray[i-2]);
			nArray[i] = sum;
		}

		return nArray;
	}
}
