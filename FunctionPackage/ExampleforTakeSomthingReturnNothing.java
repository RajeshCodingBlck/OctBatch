package FunctionPackage;

public class ExampleforTakeSomthingReturnNothing {

	
	public static void fun1(int a, int b, int c) {
		
		System.out.println("fun1 is Start");
		System.out.println(a+b);
		fun2(c);
		System.out.println("fun1 is End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      int a=12;
      int b=13;
      int c=14;
      fun1(a,b,c);
      System.out.println("Main is End");
      
	}
	public static void fun2(int c) {
		System.out.println("fun2 is Start");
		System.out.println(c+13);
		System.out.println("fun2 is End");
	}

}
