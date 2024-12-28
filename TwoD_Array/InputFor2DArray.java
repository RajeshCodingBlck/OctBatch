package TwoD_Array;

import java.util.Scanner;

public class InputFor2DArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];

		Scanner s = new Scanner(System.in);
		
		// Input
		// row
		for (int i = 0; i < 3; i++) {
			// col
			for (int j = 0; j < 4; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		// Print
		// row
		for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		for(int j=0;j<4;j++) {
//			for(int i=0;i<3;i++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

}
