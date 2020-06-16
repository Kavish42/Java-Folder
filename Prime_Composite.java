package Assignments;

import java.util.Scanner;

public class Prime_Composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int number =sc.nextInt();
				int i=2;
		while(number>0) {
			if(number%i==0)
				break;
			i++;
		}
			if(number == i)
			System.out.println("Number is prime");
		else
			System.out.println("Number is composite");
	
		}
	}

