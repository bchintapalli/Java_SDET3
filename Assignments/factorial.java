package Assignments;

import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
				
		Scanner n = new Scanner(System.in);
		
		int number = n.nextInt();
		//System.out.println(number);
		int fact = 1;
		while (number != 0)
		{
			
			fact = fact * number;
			number-=1;
		}
		System.out.println("Factorial of number is:" +fact);
	}
}
