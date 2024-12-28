package _2DArrayQuestion;

public class RotateBy90 {

	public static void Transpose(int[][] arr) {

		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (j < i) {
					continue;
				}
//			System.out.print("Swap Between ( "+i+ " "+ j+" )" );
//			System.out.println("( "+ j+ " "+ i+ " )");
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	public static void reverse(int [] arr) {
		
		int i=0;
		int j= arr.length-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	public static void reverseFor2D(int [][] arr) {
		
		
		int rowi=0;
		int rowj=arr.length-1;
		while(rowi<=rowj) {
			
			for(int j=0; j<arr[0].length;j++) {
				
				int temp= arr[rowi][j];
				arr[rowi][j]= arr[rowj][j];
				arr[rowj][j]= temp;
			}
			rowi++;
			rowj--;
		}
	}
	
	public static void reverse(int [][] arr) {
		
		int i=0;
		int j= arr.length-1;
		while(i<=j) {
			
			 int [] temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 i++;
			 j--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {

				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 }, 
		};
		Transpose(arr);
		reverseFor2D(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
