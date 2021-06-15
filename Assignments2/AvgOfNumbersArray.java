package Assignments2;

public class AvgOfNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        double[] arr = {1,2,3,4,5};
		        double total = 0;
		        for(int i=0; i<arr.length; i++)
		        {
		        	total = total + arr[i];
		        }
		        double average = total / arr.length;
		        System.out.println("The average is" + average);
		    }
		}