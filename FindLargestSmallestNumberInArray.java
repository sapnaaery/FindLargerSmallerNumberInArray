package day7;

public class FindLargestSmallestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 10, -6, 70, 89, 3, 11, 14, 25, 17 };

		if (arr == null || arr.length == 0)// to handle scenario where array is empty
		{
			System.out.println("Array is empty");
			return;
		}
		// initializing max/min variables
		int maxNumber = arr[0];
		int minNumber = arr[0];

		// updating max/min values in Array
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minNumber) {
				minNumber = arr[i];
			}
			if (arr[i] > maxNumber) {
				maxNumber = arr[i];
			}
		}
		System.out.println("Maximum number is: " + maxNumber);
		System.out.println("Minimum number is: " + minNumber);

	}

}
