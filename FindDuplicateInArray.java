package week1.day2;

import java.util.Arrays;

public class FindDuplicateInArray
{
	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Arrays.sort(arr);
		System.out.println("Duplicates in the array :" );
		
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i] == arr[i-1])
			{
			  System.out.println(arr[i]);
			}
		}
		
	}

}
