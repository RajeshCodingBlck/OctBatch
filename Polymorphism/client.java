package Polymorphism;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj =new B();
        
        System.out.println( ((B)obj).a);
        obj.fun("abc", 1, 2);
	}

}
