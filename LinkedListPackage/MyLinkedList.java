package LinkedListPackage;

public class MyLinkedList {

	 Node head=null;
	
     public void insertAtBegin(int val) {
    	 
    	 Node newNode= new Node(val);
    	 newNode.next=head;
    	 head= newNode;
     }
     
     public void display() {
    	 
    	 Node temp= head;
    	 while(temp !=null) {
    		 System.out.print(temp.data+ " -> ");
    		 temp=temp.next;
    	 }
    	 
     }
     
      public void insertAtEnd(int val) {
    	  
    	  if(head==null) {
    		  insertAtBegin(val);
    		  return;
    	  }
    	  Node newNode =new Node(val);
    	  Node i=head;
    	  while(i.next !=null) {
    		  i=i.next;
    	  }
    	  i.next=newNode;
      }
      
      public void deleteAtBegin()  throws Exception{
    	  
    	  if(head==null) {
    		  throw new Exception("LinkedList is Empty");
    	  }
    	  //head=head.next;
    	  Node temp=head.next;
    	  head.next=null;
    	  head=temp;
      }
      
      public void deleteAtEnd() {
    	  
    	  if(head==null) {
    		  // Exception
    		  return ;
    	  }else if(head.next==null) {
    		  head=null;
    		  return;
    	  }
    	  Node temp=head;
    	  while(temp.next.next !=null) {
    		  temp=temp.next;
    	  }
    	  temp.next=null;
    	  
      }
}
