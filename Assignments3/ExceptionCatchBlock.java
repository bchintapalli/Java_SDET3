package Assignments3;

public class ExceptionCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 100/0;
		}
		catch(ArithmeticException ae)
		{
	    	String s = "99.999";
	        try {  
	                 int b = Integer.parseInt(s);  
	        }
	        catch(NumberFormatException ne)
	        {  
	            System.out.println("NumberFormatException");
	            ne.printStackTrace();
	        }  
			ae.printStackTrace();
		}
	}

}
