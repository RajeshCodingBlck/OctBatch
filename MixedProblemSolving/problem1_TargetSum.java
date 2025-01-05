package MixedProblemSolving;

import java.util.*;

public class problem1_TargetSum {

	
	 
	public static boolean Bs(int [] arr, int low, int high, int target) {
		
		while(low<=high) {
			int mid= (low+high)/2;
			if(arr[mid]==target) {
				return true;
			}else if(arr[mid]< target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return false;
	}
	
	public static boolean check2(int [] arr, int target) {
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			int secondValue= target-arr[i];
			boolean ans= Bs(arr, i+1, arr.length-1, secondValue);
			if(ans==true) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkMethod3(int [] arr, int target) {
		
		Arrays.sort(arr);
		int i=0;
		int j= arr.length-1;
//		 Two Pointer
		 while(i<j) {
			 int sum= arr[i]+arr[j];
			 if(sum==target) {
				 return true;
			 }else if(sum<target) {
				 
				  i++;
			 }else {
				 j--;
			 }
		 }
		 return false;
	}
	public static boolean check(int [] arr, int target) {
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {	
//				System.out.println(" ( "+i+ " , "+ j+ " ) ");
				if(arr[i]+arr[j]==target) {
					return true;
				}	
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,7,1,3,2,5,10};
      int target=12;
      boolean ans= checkMethod3(arr, target);
      System.out.println(ans);
	}

}
