package GraphPkg;

import java.util.Scanner;

public class graphUsingAdjacentMatrix {
    
	int [][] arr;
	graphUsingAdjacentMatrix(int n, int e){ // n is No of vertex, e is No of edges
		arr= new int[n][n];
		build(e);
	}
	private void build(int e) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		for(int i=0; i<e;i++) {
			int u= s.nextInt();
			int v=s.nextInt();
			arr[u][v]=1;
			arr[v][u]=1;
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
