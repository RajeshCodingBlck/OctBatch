package FunctionPackage;

public class TakeSomethingReturnNothing {

	public static void subtract(int a, int b) {

		System.out.println("subtract is Start");
		int ans = a - b;
		System.out.println(ans);
		System.out.println("subtract is End");
	}

	public static void add(int a, int b) {

		System.out.println("add is Start");
		a=2;
		b=3;
		int ans = a + b;
		System.out.println(ans);
		System.out.println("add is End");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main is Start");
		add(12,14);
		subtract(12, 14);
		System.out.println("Main is End");
	}

}
