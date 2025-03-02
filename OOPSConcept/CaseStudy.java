package OOPSConcept;

class A{
	
	public int a=13;
	A(int b){
		a=b;
	}
	
}
public class CaseStudy {
    
	// Stack me changes persist nahi karegi..
//	public static void swap(A obj1, A obj2) {
//		A temp=obj1;
//		obj1=obj2;
//		obj2=temp;
//	}
	
//	Heap me changes persist karengi
//	public static void swap(A obj1, A obj2) {
//		int temp=obj1.a;
//		obj1.a=obj2.a;
//		obj2.a=temp;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    A obj1= new A(14);
        A obj2= new A(15);
        System.out.println("Before Swap "+ obj1.a + " "+ obj2.a);
//        swap(obj1, obj2);
        System.out.println("After Swap "+ obj1.a + " "+ obj2.a);
	}

}
