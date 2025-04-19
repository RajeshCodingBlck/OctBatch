package GraphPkg;

import java.util.Scanner;

public class MyGraph {

	int [][] arr;
	MyGraph(int e){
		arr= new int [e][2];
		build();
	}
	private void build() {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			int u= s.nextInt();
			int v=s.nextInt();
			arr[i][0]=u;
			arr[i][1]=v;
		}
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][0]+" "+ arr[i][1]);
		}
	}
	
	
	
}
