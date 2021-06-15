package Assignments3;

public class OccuranceofCharinStr {

	public static void main(String[] args) {
		String str = "DevLabs Alliance Training";
		System.out.println(str);
		// count occurrence 
		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'D')
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of a: "+count);
	}

}
