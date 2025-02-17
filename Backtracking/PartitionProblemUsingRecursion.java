package Backtracking;

import java.util.ArrayList;

public class PartitionProblemUsingRecursion {

	public static void helper(int [] arr, int i,
			int sum1, int sum2, 
			ArrayList<Integer> g1, ArrayList<Integer> g2,
			int totalSum) {
		
		if(i==arr.length) {
			if(sum1==sum2) {
				System.out.println(g1+ " "+g2);
			}
			return;
		}
		if(sum1>totalSum/2  || sum2>totalSum/2) {
			return;
		}
		// arr[i] G1 me Jay.
		g1.add(arr[i]);
		helper(arr, i+1, sum1+arr[i],sum2, g1, g2 , totalSum);
		g1.remove(g1.size()-1);
		// arr[i] G2 me Jay
		g2.add(arr[i]);
		helper(arr, i+1, sum1, sum2+arr[i], g1,g2, totalSum);
		g2.remove(g2.size()-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,1,1};
      int totalSum=0;
      for(int val : arr) {
    	  totalSum+=val;
      }
      ArrayList<Integer> g1= new ArrayList();
      ArrayList<Integer> g2= new ArrayList();
      helper(arr, 0, 0,0, g1, g2, totalSum);
	}

}
