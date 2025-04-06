package DP;

public class CountPathTabulationMethod {

	public static int method1(int n, int m) {

		int[][] dp = new int[n][m];

		// dp[i][j]= No of ways to reach (n-1, m-1) from (i,j);
		for (int i = 0; i < n; i++) {
			dp[i][m - 1] = 1;
		}
		for (int j = 0; j < m; j++) {
			dp[n - 1][j] = 1;
		}
		for (int i = n - 2; i >= 0; i--) {
			for (int j = m - 2; j >= 0; j--) {

				dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
			}
		}

		return dp[0][0];

	}

	public static int method2(int n, int m) {

		int[][] dp = new int[n][m];

		// dp[i][j]= No of ways to reach (n-1, m-1) from (i,j);
		for (int i = 0; i < n; i++) {
			dp[i][0] = 1;
		}
		for (int j = 0; j < m; j++) {
			dp[0][j] = 1;
		}
		for (int i = 1; i <n; i++) {
			for (int j = 1; j <m; j++) {

				dp[i][j] = dp[i - 1][j] + dp[i][j -1];
			}
		}

		return dp[n-1][m-1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method2(3, 3));
	}

}
