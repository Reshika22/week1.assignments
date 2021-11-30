package week1.day2;

public class CharOccurence {

	public static void main(String[] args) 
	{
		String str = "Welcome to Chennai";
		char occurence = 'e';
		int count = 0;
		String lowcase = str.toLowerCase();
		int length = str.length();

		for (int i = 0; i < length; i++) 
		{
			if(lowcase.charAt(i) == occurence)
			{
				count++;
			}
		}
		if(count > 0)
		{
			System.out.println("The char "+ occurence +" occured " + count + " times in the given string - " + str );
		}
		else
		{
			System.out.println("No occurence of char " + occurence + "in the statement");
		}

	}

}
