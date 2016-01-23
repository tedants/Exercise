package exer.unique;

import java.util.Scanner;

public class Unique {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter size=");
		scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("size=" + size);
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("N=");
			numbers[i] = new Scanner(System.in).nextInt();
		}
		for (int n : numbers) {
			System.out.println(n);
		}

		System.out.println("unique = " + lonelyInt(numbers, 0));

	}

	private static int lonelyInt(int[] numbers, int currIndex) {
		int unique = numbers[currIndex];
		int dupCount = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < 0 || numbers[i] > 99)
				throw new IllegalArgumentException("N > 0 and < 100");

			if (unique == numbers[i]) {
				dupCount++;
			}
		}

		if (dupCount < 2)
			return unique;
		else{
			currIndex++;
			dupCount = 0;
			unique = -1;
			if (currIndex < numbers.length) {
				unique = lonelyInt(numbers, currIndex);
			}
		}
		
		return unique;

	}

}
