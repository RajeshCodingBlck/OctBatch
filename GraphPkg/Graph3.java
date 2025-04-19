package GraphPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph3 {

	// Array of ArrayList
	ArrayList<Integer>[] arr;

	Graph3(int n, int e) {
		arr = new ArrayList[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new ArrayList();
		}
		build(e);
	}

	private void build(int e) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < e; i++) {
			int u = s.nextInt();
			int v = s.nextInt();
			arr[u].add(v);
			arr[v].add(u);
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+ " "+ arr[i]);
		}
	}
}
