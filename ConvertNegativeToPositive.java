package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		
		int num = -29;
		
		if(num < 0)
		{
			System.out.println("The given number is negative");
			num = -1 * num;
			System.out.println("Converted Positive number is :" +num);
		}
		else if (num > 0)
		{
			System.out.println("The given number " + num + " is already a positive number");
		}
		else
		{
			System.out.println("The number is neither negative nor positive");
		}

	}

}
