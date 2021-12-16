package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayUsingCollections {

	public static void main(String[] args) {

		//Second Largest Integer
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(dataList);
		System.out.println("Second Largest : " + dataList.get(dataList.size()-2));

		//Remove and Find Duplicates
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> newSet = new LinkedHashSet<Integer>();
		System.out.println("********************************");
		System.out.println("duplicates are : ");
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = newSet.add(arr[i]);
			if(!flag)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Removed Duplicates : " + newSet);
		System.out.println("********************************");
		
		//Missing elements in the array
		Integer[] arr1 = {1,2,3,4,7,6,8};
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println(arrayList);
		for (int i = 1; i < arr1.length; i++) 
		{
			
			if(arrayList.get(i-1)!= i)
			{
				System.out.println("The missing element : " + i);
			}
			
		}
	}

}
