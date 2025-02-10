package RecursionwithMulitpleCalls;

public class Fibonacci {
    
	// N -> Nth fibonacci 
	public static int fibo(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int chhotaAns1=fibo(n-1);
		int chhotaAns2=fibo(n-2);
		int meraAns= chhotaAns1+ chhotaAns2;
		return meraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(fibo(5));
	}

}
