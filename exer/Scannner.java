package exer;

import java.util.Scanner;

public class Scannner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter user name : ");
	    String username = scanner.nextLine();      
	    System.out.println("You entered : " + username);
	    System.out.print("Please enter age : ");
	    int number = scanner.nextInt();
	    System.out.println("You entered : " + number);
	    System.out.print("Please enter f : ");
	    float f = scanner.nextFloat();
	    System.out.println("You entered : " + f);
	    System.out.print("Please enter l : ");
	    float l = scanner.nextLong();
	    System.out.println("You entered : " + l);
	}

}
