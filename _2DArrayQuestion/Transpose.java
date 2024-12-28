package _2DArrayQuestion;

public class Transpose {
  
	public static void Transpose(int [][] arr) {
		
		int rows=arr.length;
		int cols= arr[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0;  j<cols;j++) {
				if(j<i) {
					continue;
				}
//			System.out.print("Swap Between ( "+i+ " "+ j+" )" );
//			System.out.println("( "+ j+ " "+ i+ " )");
				int temp= arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {
				  
				  {1,2},
				  {5,6}
		};
		Transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
