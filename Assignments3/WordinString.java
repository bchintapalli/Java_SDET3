package Assignments3;

public class WordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String OriginalStr = "A brown fox ran away fast";
				int intIndex = OriginalStr.indexOf("brown");
				if(intIndex == - 1) {
					System.out.println("Brown not found");
				} else {
					System.out.println("Found Brown at index "+ intIndex);
				}
			}
		}
