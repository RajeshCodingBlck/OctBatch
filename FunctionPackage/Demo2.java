 package FunctionPackage;

public class Demo2 {
	public static void fun2() {
		System.out.println("fun2 is Start");
		int a=12;
		int b=13;
		System.out.println(a+b);
		System.out.println("fun2 is end");
	}
	public static void fun1() {
		System.out.println("fun1 is Start");
		fun2();
		System.out.println("fun1 is end");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Main is Start");
     fun1();
     fun2();
     System.out.println("Main is End");
	}

}
