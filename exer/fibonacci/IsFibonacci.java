package exer.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IsFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entryCount = sc.nextInt();

		if (entryCount < 1 || entryCount > 100000)
			throw new IllegalArgumentException(
					"input should be between 1 and 100000");

		List<BigInteger> sortedEntries = new ArrayList<BigInteger>(entryCount);

		for (int i = 0; i < entryCount; i++) {
			long t = sc.nextLong();
			if (t < 1 || t > 10000000000L)
				throw new IllegalArgumentException(
						"input should be between 1 and 10000000000");

			sortedEntries.add(BigInteger.valueOf(t));
		}

		Collections.sort(sortedEntries);

		BigInteger largest = sortedEntries.get(sortedEntries.size() - 1);

		System.out.println("largest is " + largest);

		List<BigInteger> fiboList = fibonacci(largest);

		for (BigInteger x : sortedEntries) {
			boolean isFibo = fiboList.contains(x);

			if (isFibo)
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");
		}

	}

	private static List<BigInteger> fibonacci(BigInteger n) {

//		int size = n.intValue();
		
		List<BigInteger> fList = new ArrayList<BigInteger>(n.intValue());
		
		
//		9253734625
		try {
//			nArray = new BigInteger[size];
//			nArray[0] = BigInteger.ZERO;
//			nArray[1] = BigInteger.ONE;
			fList.add(BigInteger.ZERO);
			fList.add(BigInteger.ONE);
			
			for (int i = 2; i < n.longValue(); i++) {
				fList.add(fList.get(fList.size()-1).add(fList.get(fList.size()-2)));
//				nArray[i] = nArray[i - 1].add(nArray[i - 2]);
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e.toString());
		}

		return fList;
	}
}
