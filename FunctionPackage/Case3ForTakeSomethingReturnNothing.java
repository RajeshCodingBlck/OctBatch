package FunctionPackage;

public class Case3ForTakeSomethingReturnNothing {

	
	public static void fun1(int a, int b, int c) {
		
		a=1;
		b=2;
		System.out.println(a+b);
		fun2(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      int a=12;
      int b=13;
      int c=14;
      System.out.println(" "+ a+ " "+ b+ " "+c);
      fun1(a,b,c);
      System.out.println(" "+ a+ " "+ b+ " "+c);
	}
	public static void fun2(int a) {
		a=10;
		System.out.println(a+13);
	}

}
