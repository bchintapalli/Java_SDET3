package Assignments3;

public class StringConvertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "Bala";
			int len = str.length();
			//string to char array
			char[] ch = str.toCharArray();
			//System.out.println(chars.length);
			
			for (int i=0;i<len;i++)
			{
				ch[i] = str.charAt(i);
				System.out.println(ch[i]);
			}
			
			char[] str1 = new char[len];
			str.getChars(0, len, str1, 0);
			System.out.println(str1);
			
		}
}
