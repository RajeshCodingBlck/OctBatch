package Polymorphism;

public class A {

	int a = 1;
	
	public void fun(int a) {
		System.out.println("fun of int is called");
	}

	public void fun(String a) {
		System.out.println("fun of String is called");
	}

	public void fun(int a, int b) {
		System.out.println(a + " " + b);
	}

	public void fun(int a, String b) {

	}

	public void fun(String a, int b) {

	}

	// compiler Time polymorphism me nahi aata.
	public  int fun(String a, int b, int c) {
	    System.out.println("hello from fun A");
       return 0;
	}
}
