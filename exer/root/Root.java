package exer.root;

import java.util.Scanner;

public class Root {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		float number = scanner.nextFloat();
		System.out.println("Please enter root");
		int root = scanner.nextInt();
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.cbrt(9));
		
	}

}
