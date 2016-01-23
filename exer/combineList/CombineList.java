package exer.combineList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CombineList clist = new CombineList();
		String[] a = { "1", "2", "3" };
		String[] b = { "a", "b", "c" };

		List<String> strList = clist
				.combine(Arrays.asList(a), Arrays.asList(b));

		System.out.println(strList);

	}

	private List<String> combine(List<String> strList1, List<String> strList2) {

		List<String> newList = new ArrayList<String>();

		for (int i = 0; i < strList1.size(); i++) {
			String a = strList1.get(i);
			String b = strList2.get(i);

			newList.add(a);
			newList.add(b);
		}

		return newList;
	}

}
