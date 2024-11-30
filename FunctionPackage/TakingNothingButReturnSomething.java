package FunctionPackage;

public class TakingNothingButReturnSomething {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Main si Start");
     int ans=fun1();
     System.out.println(ans);
     System.out.println("Main is End");
	}
	
	public static int fun1() {
		System.out.println("fun1 is Start");
		int a=12;
		int b=13;
		int ans= a+b;
		System.out.println("fun1 is End");
		return  ans;
		
	}

}
