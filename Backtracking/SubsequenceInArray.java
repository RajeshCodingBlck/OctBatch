package Backtracking;

import java.util.ArrayList;

public class SubsequenceInArray {

	
	public static void getSubseq(int [] arr, int i, String ans) {
		
		if(i==arr.length) {
			System.out.println(ans);
			return;
		}
		
		// ith Index ki value ko Subseq Ka part Banaoge 
		getSubseq(arr, i+1,ans+arr[i]+" , ");
		
		//ith Index ki value ko Subseq Ka part nahi Banaoge 
		getSubseq(arr, i+1,ans);
	}
	public static void getSubseq(int [] arr, int i, 
			ArrayList<Integer> ans, int sum,int target) {
		if(i==arr.length) {
			System.out.println(ans);
//			if(sum<=target) {
//				System.out.println(ans);
//			}
			return;
		}
		
		
		
		if(sum+arr[i]<=target) {
			ans.add(arr[i]);
			getSubseq(arr, i+1,ans, sum+arr[i], target);
			ans.remove(ans.size()-1);
		}
		// //ith Index ki value ko Subseq Ka part nahi Banaoge 
		getSubseq(arr, i+1, ans, sum, target);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3};
//      getSubseq(arr, 0,"");
      int target=2;
      ArrayList<Integer> ans=new ArrayList();
      getSubseq(arr, 0, ans, 0,target);
	}

}
