package GraphPkg;

import java.util.*;

public class Client {

	public static void dfs(int src, ArrayList<Integer> [] arr, int [] visited) {
		
		System.out.println(src);
		visited[src]=1;
		for( int nb : arr[src]) {
			if(visited[nb]==0) {
				 dfs(nb,arr, visited);
			}
		}
		
	}
	
	public static void bfs(int src, ArrayList<Integer> [] arr, int [] visited ) {
		
		LinkedList<Integer> q= new LinkedList();
		q.add(src);
		visited[src]=1;
		while(q.size()>0) {
			// remove
			int rmNode= q.removeFirst();
			// work
			System.out.println(rmNode);
			// add their Neighbour
			for( int nb: arr[rmNode]) {
				if(visited[nb]==0) {
					q.add(nb);
					visited[nb]=1;
				}
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     MyGraph g= new MyGraph(6);
//     g.display();
     
//		graphUsingAdjacentMatrix g= new graphUsingAdjacentMatrix(5,6);
//		g.display();
       // 0 1 0 2 1 2 1 3 2 4 3 4 G1
	  
		// 0 1 1 3 3 2 0 2 4 5
		Graph3 g= new Graph3(6,5);
		g.display();
		int [] visited= new int[6];
//		dfs(0, g.arr, visited);// connected Graph // O(E)
		
		// dfs for disconnected Graph.. // O(V + E)
//		for(int i=0;i<6;i++) {
//			if(visited[i]==0) {
//				dfs(i,g.arr, visited);
//			}
//		}
		
		bfs(0, g.arr, visited);
		
		for(int i=0;i<6;i++) {
			if(visited[i]==0) {
				bfs(i, g.arr, visited);
			}
		}
		
		
	}

}
