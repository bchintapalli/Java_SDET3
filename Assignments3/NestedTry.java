package Assignments3;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int num = 100/0;
	    	String s = "99.999";
	        try {  
	                 int a = Integer.parseInt(s);  
	        }
	        catch(NumberFormatException e)
	        {  
	            System.out.println("NumberFormatException");
	            e.printStackTrace();
	        }  
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmeticexception");
			e.printStackTrace();
		}
	}

}
