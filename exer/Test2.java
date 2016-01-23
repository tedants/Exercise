package exer;

import static exer.claz.Sample1.NUM;

import java.util.Scanner;

public class Test2 {

	private static final String ODD = "ODD";
	private static final String EVEN = "EVEN";
	
	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String inputE = Numbers.EVEN.toString();
		
		if(input % 2 == NUM){
			inputE = Numbers.EVEN.toString();
			System.out.printf("The input %1s is %2s", input, Numbers.EVEN);
		}else{
			inputE = Numbers.ODD.toString();
			System.out.printf("The input %1s is %2s --- 1s", input, Numbers.ODD);
		}
		
		switch(inputE){
		case "ODD":
			System.out.println("switch " + Numbers.ODD);
			break;
		case "EVEN":
			System.out.println("switch " + Numbers.EVEN);
			break;
		default:
			throw new Exception("Switch default");
		}
		
		

	}
}
