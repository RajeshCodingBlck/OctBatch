package DP;

public class FiboTabulationMethod {

	public static int fibo(int n) {
		
		int [] dp= new int [n+1];
		
//		dp[i]=  Answer of fibo(i)
		
		dp[0]=1;
		dp[1]=1;
		for(int i=2; i<=n;i++) {
			dp[i]= dp[i-1]+ dp[i-2];
		}
		return dp[n];
		
	}
	
	public static int fiboMethod2(int n) {
		
		
		int [] dp= new int[3];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[2]= dp[0]+dp[1];
			dp[0]= dp[1];
			dp[1]=dp[2];
		}
		return dp[2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(fiboMethod2(6));
	}

}
