package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		

		// fibonacci series
		//0,1,1,2,3,5
		
		int range = 1;
		int firstnum = 0;
	    int secondnum = 1;
	    System.out.println("Fibonacci Series :");
		
		   for(int i = 1; i <= range ; i++)
		   {
	             if(i == 1)
	             {
	            	 System.out.println(firstnum);
	             }
	             else if (i == 2)
	             {
	            	System.out.println(secondnum); 
	             }
	             else
	             {
	              int fibonacci = firstnum + secondnum;
	             
	              firstnum = secondnum;
	              secondnum = fibonacci;
	              System.out.println(fibonacci);
	             }
	              
		   }
			   

	}

}
