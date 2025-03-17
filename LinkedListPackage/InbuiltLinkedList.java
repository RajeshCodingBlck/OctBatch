package LinkedListPackage;

import java.util.*;

public class InbuiltLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Integer> arr= new ArrayList();
		
	     List<Integer> ls= new LinkedList();
		
//		 ls.addFirst(13);
//		 ls.addFirst(40);
//		 ls.addFirst(50);
//		 
//		 ls.addLast(100);
//		 
//		 ls.removeFirst();
//		 ls.removeLast();
		 
		 ls.add(2,1000);
		 ls.add(1, 200);
		 ls.set(1, 10);
		 System.out.println(ls);
		 System.out.println(ls.get(2));
		 
		 
		 
		
	}

}
