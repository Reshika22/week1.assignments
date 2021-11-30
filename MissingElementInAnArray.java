package week1.day2;

import java.util.Arrays;


public class MissingElementInAnArray {

	public static void main(String[] args) 
	{
		
		int[] num = {1,2,3,4,7,6,8};
		Arrays.sort(num);
		
		for (int i = 1; i < num.length; i++)
		{
			if(num[i-1] != i)
			{
				System.out.println("The missing number is : " + i);
				break;
				
			}
		}
			
		
	}

}
