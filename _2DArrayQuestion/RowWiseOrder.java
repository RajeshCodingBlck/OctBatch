package _2DArrayQuestion;

import java.util.Scanner;

public class RowWiseOrder {

	public static void RowWiseForm(int [][] arr) {
		
		int rows=arr.length;
		int cols= arr[0].length;
		
		for(int i=0; i<rows;i++) {
			if(i%2==0) { // Row is Even
				for(int j=0; j<cols;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}else {
				for(int j=cols-1; j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner s= new Scanner(System.in);
//      int n= s.nextInt(); // No of Rows
//      int m= s.nextInt(); // No of Columns
//      int [][] arr= new int[n][m]; 
//      for(int i=0;i<n;i++) {
//    	  for(int j=0;j<m;j++) {
//    		  arr[i][j]=s.nextInt();
//    	  }
//      }
	 int [][] arr= {	 
			 {1,2,3,4},
			 {5,6,7,8},
			 {9,10,11,12}
	 };
      
      RowWiseForm(arr);
      
      
	}

}
