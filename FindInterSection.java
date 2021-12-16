package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;


public class FindInterSection {

	public static void main(String[] args) {
		
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		if(array1.length == array2.length) 
		{
					
		for (int i = 0; i < array2.length; i++) 
		{
			set2.add(array2[i]);
			set1.add(array1[i]);
		}
		set1.retainAll(set2);
		System.out.println("Intersection elements :" +set1);
		set2.removeAll(set1);
		System.out.println("Non Intersection elements in Set 2 : " + set2);
		
		
		}
	}

}
