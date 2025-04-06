package DP;

public class LCS {
    
	class Solution {


	    public int helper(String  text1, String text2, int i, int j, int [][] dp){

	       if(i== text1.length() || j== text2.length()){
	         return 0;
	       }

	       if(dp[i][j] !=-1){
	          return dp[i][j];
	       }

	        char ch1= text1.charAt(i);
	        char ch2= text2.charAt(j);

	        if(ch1==ch2){
	             int ans = 1+ helper(text1, text2, i+1, j+1, dp);
	             dp[i][j]=ans;
	             return ans;
	        }else{
	            int ans1= helper(text1, text2,i+1,j, dp); // Skip ith Index from text1
	            int ans2= helper(text1, text2, i, j+1, dp); // Skip jth Index from text2
	            return  dp[i][j]=  Math.max(ans1, ans2);
	        }
	    }
	    public int longestCommonSubsequence(String text1, String text2) {
	        
	       int n=text1.length();
	       int m= text2.length();
	       int [] [] dp= new int [n][m];
	       for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            dp[i][j]=-1;
	        }
	       }
	       return helper(text1, text2, 0,0, dp);

	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
