package Assignments;

import java.util.Scanner;

	public class ReverseElements {

		public static void main(String[] args) {
			
			int i,j=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of elements in an array:");
			int n=scan.nextInt();
			int array[]=new int[n];
			int rev[]=new int[n];
			System.out.println("Please enter the "+ n );
			for(i=0;i<n;i++) {
				System.out.println("Please enter the array elements:\n");
				array[i]=scan.nextInt();
			}
			
			System.out.println("Reverse of an array:");
			for(i=n;i>0;i--,j++) {
				rev[j]=array[i-1];
				System.out.print(rev[j]);
			}
		}
}
