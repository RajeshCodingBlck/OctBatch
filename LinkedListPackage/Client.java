package LinkedListPackage;

public class Client {

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node n1= new Node(13);
		Node n2= new Node(14);
		Node n3= new Node(15);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		
		n1.next=n3;  // link between n1 and n3
		n3.next= n2; // link between n3 and n2
		
		System.out.println("n1 ke next me " + n1.next);
		System.out.println("n3 ke next me"+ n3.next);
		
		
		Node head= n1; // n1 ka naam head bhi ho gaya.
		
		Node temp= head;
		
//		temp=head.next;
		
		temp=temp.next;
		temp=temp.next;
		
		
		
		
	}

}
