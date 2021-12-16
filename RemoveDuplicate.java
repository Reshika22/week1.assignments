package week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "We learn java basics as part of java sessions in java week1";
		char[] charray = str.toCharArray();
		String newstr = "";
		Set<Character> removeDup = new LinkedHashSet<Character>();
		for (Character chdup : charray) {
			if(chdup!= ' ') {
				boolean flag = removeDup.add(chdup);

				if(flag) {
					newstr = newstr + chdup;

				}
			}		
		}
		System.out.println(newstr);
	}
}

