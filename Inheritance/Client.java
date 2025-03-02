package Inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      B obj= new B();
//      System.out.println(obj.a);
////      System.out.println(obj.)
      
      
        A obj1= new A();
        B obj2= new B();
        
        A obj3= new B(); // Late Binding and Early Binding Concept.
        B obj4= new A();
        
        int a=5;
        
        
	}

}
