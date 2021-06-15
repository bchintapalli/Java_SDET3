package Assignments3;

public class NumformatExpt {  
	     
    public static void main(String[] args) {  
    	String s = "99.999";
        try {  
                 int a = Integer.parseInt(s);  
        }
        catch(NumberFormatException e)
        {  
            System.out.println("number format exception");
            e.printStackTrace();
        }  
      }  
}  