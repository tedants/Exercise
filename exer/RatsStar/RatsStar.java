package exer.RatsStar;

public class RatsStar {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] _0_9 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		RatsStar rs = new RatsStar();

		Object[] array = rs.getRatsStar(_0_9, 9);

		for (Object o : array) {
			int a[] = (int[]) o;
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	private Object[] getRatsStar(int[] array, int divisor) {

		Object[] ratsStar = new Object[2];

		ratsStar[0] = new int[] { 1, 2, 3, 4 };
		ratsStar[1] = new int[] { 4, 3, 2, 1 };

		String[] combinations = getAllCombinations(array, 4, 0, 0, "");

		return ratsStar;
	}

	private String[] getAllCombinations(int[] array, int len, int start, int index,
			String s) {
		
		if(start>0 && index==0){
			s = s + array[start];
		}
		else
			s = s + array[index];
		
		System.out.println("s ="+s + "index=" + index );
		if (s.length() < len) {
			index++;
			if(index >= array.length)
				index = 0;

			s = s + getAllCombinations(array, len, start, index, s);
		}else{
			s=s.substring(0, 1);
			if(index < len)
				index = len - index +1;
			else if(index == len) 
				index = len - 1;
			
			System.out.println("new s="+s);
			if(index < array.length)
				s = s + getAllCombinations(array, len, start, index, s);
			else {
				index = 0;
				s = s + getAllCombinations(array, len, start, index, s);
			}
				
		}
		
//		++start;
//		index = 0;
//		s="";
//
//		if(start < array.length){
//			s = s + getAllCombinations(array, len, start, index, s);
//		}

		return null;
	}

}
