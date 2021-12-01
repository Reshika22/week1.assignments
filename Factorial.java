package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		// factorial of a number
		
				int num = 3;
				int fact = 1;
				for (int i = 1 ; i <= num; i++) {
					
					fact = fact * i;
					
				}

				System.out.println("Factorial of "+ num + " is : " +fact);

	}

}
