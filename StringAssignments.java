package org.college;



public class StringAssignments {

	public static void main(String[] args) {

		String text = "Java Exercise";
		System.out.println("Character at index 5 : "+text.charAt(5));
		System.out.println("Character at index 12 : "+text.charAt(text.length()-2));
		System.out.println("**************************");

		String s1="I am Learning Java"; 
		String s2="I am learning java";
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
		System.out.println(s1.equals(s2));
		System.out.println(str3.equals(str4));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(s1==s2);
		System.out.println(str3==str4);
		System.out.println("**************************");

		String sentence = "I am working with Java8";
		sentence = sentence.replace("8", "11");
		System.out.println(sentence);
		System.out.println("Replaced 8 with 11 :" + sentence);
		sentence = sentence.concat("#");
		System.out.println("Concat with # :"+sentence);
		System.out.println(sentence.substring(5, 14));
		System.out.println(sentence.subSequence(5, sentence.length()-1));
		System.out.println("**************************");
		//CharSequence cs = sentence.subSequence(5, sentence.length()-1);

		String test = "changeme";
		StringBuilder newstr = new StringBuilder();
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(i%2==0)
			{

				newstr = newstr.append(ch[i]);
			}
			else {
			ch[i]=Character.toUpperCase(ch[i]);

			newstr = newstr.append(ch[i]);
			}
		}
		System.out.println(newstr);


	}

}
