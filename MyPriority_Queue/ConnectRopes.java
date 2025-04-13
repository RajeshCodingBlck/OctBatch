package MyPriority_Queue;

import java.util.PriorityQueue;

public class ConnectRopes {

	public static int getTotalCost(int [] arr) {
		
		PriorityQueue<Integer> pq=new PriorityQueue();
		for(int val :arr) {
			pq.add(val);
		}
		
		int cost=0;
		while(pq.size()>1) {
			
			int rop1= pq.remove();
			int rop2=pq.remove();
			int currCost= rop1+rop2;
			cost+=currCost;
			pq.add(rop1+rop2);
		}
		return cost;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {2,3,4,6};
       System.out.println(getTotalCost(arr));
	}

}
