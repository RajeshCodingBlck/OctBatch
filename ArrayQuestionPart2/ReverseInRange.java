package ArrayQuestionPart2;

public class ReverseInRange {

	public static void reverseInRange(int[] arr, int l, int r) {

		int i = l;// Starting Point
		int j = r; // Ending Point
		while (i <= j) {

			// Swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}

	}

	public static void reverse(int[] arr) {

		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {

			// Swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverseInRange(arr, 0, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
