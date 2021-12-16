package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> sortList = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			
			sortList.add(input[i]);
		}
		Collections.sort(sortList);
        System.out.println(sortList);
	}

}
