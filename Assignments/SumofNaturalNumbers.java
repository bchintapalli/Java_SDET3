package Assignments;

public class SumofNaturalNumbers {

	public static void main(String[] args) {

        int num = 300, sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
	}
}