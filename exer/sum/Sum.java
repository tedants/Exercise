package exer.sum;

import java.util.Arrays;

public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numbers = { 0, 1, 2, 3, 4, 5 };

		Sum sum = new Sum();
		System.out.println("For Loop Sum=" + sum.sumForloop(numbers));
		System.out.println("While Loop Sum=" + sum.sumWhileLoop(numbers));
		System.out.println("Recursive Sum=" + sum.sumRecursive(numbers));

	}

	private int sumForloop(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	private int sumWhileLoop(int[] numbers) {
		int sum = 0, i = 0;
		while (i < numbers.length) {
			sum += numbers[i++];
		}
		return sum;
	}

	private int sumRecursive(int[] numbers) {
		int x = 0, y, i = 0;

		x = x + numbers[0];
		y = numbers.length;
		if (y > 1) {
			int[] newnumbers = Arrays.copyOfRange(numbers, ++i, y);
			x = x + sumRecursive(newnumbers);
		}

		return x;
	}

}
