package exer.largest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] numbers = { 50, 2, 1, 9 };
		
		List<Integer> nList = new ArrayList<Integer>(Arrays.asList(numbers));
		
		LargestValue lv = new LargestValue();
		
		List<Integer> xList = null;
		
		int largest = lv.getLargestValue(nList, xList);
		
		System.out.println(largest);
		
		//test git
		
		int[] integers = { 50, 2, 1, 9 };
		
		integers = lv.rotateIndex(integers);
		
		for(int i:integers){
			System.out.print(i + " ");
		}
	}

	private int getLargestValue(List<Integer> numbers, List<Integer> nList) {
		Integer largestInt = 0;
		int largest = 0;
		
		while (numbers.size() > 0) {
			for (Integer i : numbers) {
				char c = String.valueOf(i).charAt(0);
				int x = Integer.parseInt(""+c); 
				if (x > largest || i>largestInt) {
					largest = x;
					largestInt = i;
				}
			}
			
			if(nList == null)
				nList = new ArrayList<Integer>();
			
			nList.add(largestInt);
			numbers.remove(largestInt);
			getLargestValue(numbers, nList);
		}

		
		StringBuilder b = new StringBuilder();
		for(Integer n : nList){
			b.append(n.toString());
		}
		
		return Integer.valueOf(b.toString());
	}

	private int getNumber(int[] numbers) {

		int len = numbers.length;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			sb.append(numbers[i]);
		}

		return Integer.valueOf(sb.toString());

	}

	private int[] rotateIndex(int[] numbers) {
		
		int[] newArray = new int[numbers.length];
		int x = 0;
		for (int i = numbers.length - 1 ; i >= 0; i--) {
			newArray[x++] = numbers[i];
		}

		return newArray;
	}

}
