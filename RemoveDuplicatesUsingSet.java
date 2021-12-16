package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		
		Set<String> textSet = new LinkedHashSet<String>();
		for (String eachString : textArray) 
		{
			
			boolean flag = textSet.add(eachString);
			if(flag)
			{
				System.out.print(eachString + " ");
			}
			
			
		}

		
	}

}
