package exer;

public class NumToWordCoverter {
	final private  static String[] units = {"Zero","One","Two","Three","Four",
		"Five","Six","Seven","Eight","Nine","Ten",
		"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
		"Sixteen","Seventeen","Eighteen","Nineteen"};
	final private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
		"Sixty","Seventy","Eighty","Ninety"};


	public static String convert(Integer i) {
		//
		if( i < 20)  return units[i];
		if( i < 100) return tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");
		if( i < 1000) return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
		if( i < 1000000) return convert(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;
		return convert(i / 1000000) + " Million " + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;
	}
	
	public static String convert(Long i) {
		
		return convert(i / 1000000000L) + " Billion " + ((i % 1000000000L > 0)? " " + convert(i % 1000000000L):"") ;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(convert(2100));
		System.out.println(convert(0));
		System.out.println(convert(312132323));
	}
	
	

}
