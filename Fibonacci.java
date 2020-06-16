package Assignments;

public class Fibonacci {
	
	public static void main (String Args[]) {

	int count=7, num1=0, num2=1;
	System.out.println("Fibonacci series of "+count+" numbers:");
	
	for (int i=1; i <= count; i++)
	{
		System.out.print(num1+" ");
		
		 int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
	}
	}
	
}
