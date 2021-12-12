package org.college;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 
			String text1 = "stops";
		 	String text2 = "potss"; 
		 	int flag =0;
		 	if(text1.length()==text2.length())
		 	{
		 		char[] ch1 = text1.toCharArray();
		 		char[] ch2 = text2.toCharArray();
		 		Arrays.sort(ch1);
		 		Arrays.sort(ch2);
		 		
		 		for (int i = 0; i < ch1.length; i++)
		 		{
					if(ch1[i]!= ch2[i])
					{
						flag = 1;
						System.out.println("Characters did not match");
						break;
					}
						
				}
		 		if(flag == 0)
		 		{
		 		System.out.println("Characters in both strings  match");
		 		}
		 	}
		 	else
		 	{
		 		System.out.println("string length did not match");
		 	}

	}

}
