package TwoD_Array;

import java.util.*;
public class Printwithfunction {

	public static void Display(int [][] arr) {
		
		int noOfRows= arr.length;
		int noOfColumns= arr[1].length;

		System.out.println(noOfRows + " "+ noOfColumns);
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int [][] Input(Scanner s){
		
		
		int [] [] arr= new int[3][4];
		
		// Input
		for(int i=0;i<3;i++) {
			// col
			for(int j=0; j<4;j++) {
				arr[i][j]= s.nextInt();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int [][] arr=  Input(s);
		Display(arr);
		s.close();
		
	}

}
