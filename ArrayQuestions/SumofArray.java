package ArrayQuestions;

import java.util.Scanner;

public class SumofArray {

	public static int SumofArray(int[] arr) {
		int sum = 0;
		int n= arr.length;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // Array Ka Size

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(SumofArray(arr));

	}

}
