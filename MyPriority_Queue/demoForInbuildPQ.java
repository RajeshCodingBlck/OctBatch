package MyPriority_Queue;

import java.util.PriorityQueue;

public class demoForInbuildPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	  PriorityQueue<Integer> pq= new PriorityQueue();
	  
	  pq.add(12);
	  pq.add(3);
	  pq.add(50);
	  
	  pq.add(2);
	  
	  // In PriorityQueue we can only access Most PriorityElement of PQ (min Heap);
//	  System.out.println(pq.peek());
//	  
//	  pq.remove();
//	  System.out.println(pq.peek());
//	  System.out.println(pq.size());
	  
	  System.out.println(pq); 
	  while(pq.size()>0) {
		  System.out.println(pq.peek());
		  pq.remove();
	  }
	  
	 
	  
	  
	  
	}

}
