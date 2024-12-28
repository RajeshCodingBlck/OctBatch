package _2DArrayQuestion;

public class ColWiseTraversal {

	public static void colForm(int [] [] arr) {
		
		int rows= arr.length;
		int cols= arr[0].length;
		
		for(int j=0; j<cols;j++) {
			if(j%2==0) {
				for(int i=0; i<rows;i++) {
					System.out.print(arr[i][j]+" ");
				}
			}else {
				for(int i= rows-1;i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int [][] arr= {
			  
			  {1,2,3,4},
			  {5,6,7,8},
			  {9,10,11,12}
	  };
	  colForm(arr);
	  
	}

}
