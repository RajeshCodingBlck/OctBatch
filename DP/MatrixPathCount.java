package DP;

public class MatrixPathCount {

	public static int getCount(int currRow, int currCol,
			int desRow, int desCol, int [][] dp) {
		
		
		if(currRow==desRow && currCol==desCol) {
			return 1;
		}
		if(currRow> desRow || currCol> desCol) {
			return 0;
		}
		
		if(dp[currRow][currCol] !=-1 ) {
			return dp[currRow][currCol];
		}
		// Righ Move
		int ans1=getCount(currRow, currCol+1, desRow, desCol, dp);
		
		// Down Move
		int ans2=getCount(currRow+1, currCol, desRow, desCol, dp);
		
		int meraAns= ans1+ans2;
		dp[currRow][currCol]=meraAns;
		return meraAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] [] dp= new int[3][3];
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		dp[i][j]=-1;
        	}
        }
		System.out.println(getCount(0,0, 2,2, dp));
	}

}
