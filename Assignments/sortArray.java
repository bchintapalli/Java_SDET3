package Assignments;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {4,5,3,1,2};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]+ " ");
		
		
	}

}
