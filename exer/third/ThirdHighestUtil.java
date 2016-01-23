package exer.third;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ThirdHighestUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length < 1)
			throw new IllegalArgumentException();
		
		long t1 = System.nanoTime();
		
		SortedSet<Integer> set = sort(args);
				
		System.out.println("The 3rd highest number is " + get3rdHighest(set.toArray(new Integer[set.size()])));
		
		long t2 = System.nanoTime();
		
		System.out.println("Time Spent="+ (t2-t1));
		
		
		
		
		System.out.println(Arrays.asList(args));

//		List<Integer> sortedList = Collections.sort(Arrays.asList(args));
	}
	
	/**
	 * Extracts the third highest element in the sorted array of integers
	 * 
	 * @param nArray
	 * @return
	 */
	public static int get3rdHighest(Integer[] nArray){
		int temp = 1;
		for(int i = nArray.length-1; i >= 0 ;i--, temp++){
			if(temp==3)
				return nArray[i];
		}
		return -1;
	}
	
	private static SortedSet<Integer> sort(String[] array){
		
		SortedSet<Integer> sorted = new TreeSet<Integer>();
		
		for(String s: array){
			int n = Integer.parseInt(s);
			sorted.add(n);
		}
		System.out.println(sorted.toString());
		return sorted;
	}
	
}
