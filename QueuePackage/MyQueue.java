package QueuePackage;

import java.util.ArrayList;

public class MyQueue {


   // ArrayList
	ArrayList<Integer> arr;
	MyQueue(){
		this.arr= new ArrayList();
	}
	
	public boolean isEmpty() {
		
		return arr.size()==0;
	}
	
	public void enqueue(int val) {
		
		arr.add(val);
	}
	
	public void dequeue() throws Exception {
		
		if(isEmpty()) {
			throw new  Exception("Queue is Empty");
		}
		arr.remove(0);
	}
	
	public int front() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int frontElement= arr.get(0);
		return frontElement;
	}
}
