package ArrayQuestions;

import java.util.Scanner;

public class maximumOfArray {

	public static int maxOfArray(int[] arr) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int minOfArray(int[] arr) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int [] getAll(int [] arr) {
		
		int sum=arr[0];
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			sum= sum+arr[i];
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		int [] ans= new int[3];
		ans[0]=sum;
		ans[1]=max;
		ans[2]=min;
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		// Input the Array
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
//		System.out.println(maxOfArray(arr));
		int [] ans= getAll(arr);
		System.out.println(ans[0]+ " , "+ ans[1]+ " , "+ ans[2]);
		

	}

}
