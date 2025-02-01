package Recursion_1;

public class Factorial {

//	 Take n and n!
	public static int fact(int n) {
		
		if(n==0) { // Base Case // +ve Base
			return 1;
		}
		int chhotaAns=fact(n-1); // (n-1)!
		int MeraAns= chhotaAns*n;
		return MeraAns;
	}
	
//	Take N return sum of 1+2+3+4.....n-1+n
	// n=5
	public static int sum(int n) {
		
		if(n==1) { // +ve Base Case
			return 1;
		}
		if(n==0) { // -ve Base Case
			return 0;
		}
		int chhotaAns=sum(n-1); // 1+2+3+4=10
		int MeraAns= chhotaAns+n;
		return MeraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(sum(5));
	}

}
