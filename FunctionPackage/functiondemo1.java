package FunctionPackage;

public class functiondemo1 {

	
	public static void subtract() {
		
		System.out.println("subtract is Start");
		int a=12;
		int b= 13;
		int ans= a-b;
		System.out.println(ans);
		System.out.println("subtract is End");
	}
	public static void sum() {
		
		System.out.println("Sum is Start");
		int a=12;
		int b= 13;
		int ans= a+b;
		subtract();
		System.out.println(ans);
		System.out.println("Sum is End");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Main is Start");
     sum();
     System.out.println("Main is End");
	}

}
