package MyPriority_Queue;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		MyPriorityQueue pq= new MyPriorityQueue();
		
		pq.add(-1*12);
		pq.add(-1*40);
		pq.add(-1*5);
		pq.add(-1*10);
		
		System.out.println(-1*pq.peek());
		pq.remove();
		System.out.println(-1*pq.peek());
		
	}

}
