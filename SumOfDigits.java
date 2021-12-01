package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {

		int input = 123;
		int reminder;
		int sum = 0;
		System.out.print("SumOfDigits of "+ input +" is :");

		while (input > 0)
		{
			reminder = input % 10;
			sum = sum + reminder;
			input = input / 10;

		}

		System.out.print(sum);
	}

}
