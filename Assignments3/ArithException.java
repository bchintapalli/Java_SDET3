package Assignments3;

public class ArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int num = 1000/0;
		}
		catch(ArithmeticException  e)
		{
			System.out.println("AE");
			e.printStackTrace();
		}
	}

}
