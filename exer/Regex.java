package exer;

import java.math.BigDecimal;

public class Regex {

	private static String EXAMPLE_TEST = "This is my small example "
		+ "string which I'm going to " + "use for pattern matching.";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		String[] splitString = (EXAMPLE_TEST.split("\\s+"));
		System.out.println(splitString.length);// Should be 14
		for (String string : splitString) {
			System.out.println(string);
		}
		// Replace all whitespace with tabs
		System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		
		BigDecimal bd = new BigDecimal("0340.15");
		System.out.println(bd.doubleValue());


	}

}
