package Assignments2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num = 4612, reversed = 0;

	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
}
