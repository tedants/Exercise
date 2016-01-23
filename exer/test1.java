package exer;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] stringArray = {"David", "Moses", "Nicus"};
		List<String>  stringList = Arrays.asList(stringArray);
		
		for(String str:stringList){
			System.out.println(str);
		}  
		
		System.out.println("Integer min value="+Integer.MIN_VALUE);
		
		System.out.println("Integer max value="+Integer.MAX_VALUE);
		
		BigInteger value = new BigInteger("9253734625");
		
		while(value.longValue()>Integer.MAX_VALUE){
			int valueInt = value.intValue();
			BigInteger smallerValue = value.divide(BigInteger.TEN);
//			value = 
			System.out.println("remaining "+value.intValue());
		}
		
		
		if(Integer.MAX_VALUE < (new BigInteger("9253734625")).intValue() )
			System.out.println("Too large");
		else
			System.out.println("value ok");
	}

}
