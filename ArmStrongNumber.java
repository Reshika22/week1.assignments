package week1.day1.assignments;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int input = 123;
		int reminder;
		int sum = 0;
		int orgNumber = input;

		while (input > 0)
		{
			reminder = input % 10;
			sum = sum +( reminder * reminder * reminder);
			input = input / 10;

		}
		if (orgNumber == sum)
		{
			System.out.println(orgNumber + " is an Armstrong Number");
		}
		else 
		{
			System.out.println(orgNumber + " is not an Armstrong Number");
		}
	}
}


