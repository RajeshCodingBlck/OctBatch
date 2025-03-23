package HashMapDemo;

import java.util.*;

public class PairSumProblem {

	public static int pairSum(int [] arr, int target) {
		
		HashMap<Integer, Integer> hm= new HashMap();
		
		int ans=0;
		for(int i=arr.length-1; i>=0;i--) {
			
			int secondValue= target-arr[i];
			if(hm.containsKey(secondValue)) {
				int oldFre= hm.get(secondValue);
				ans+=oldFre;
			}
			
			if(hm.containsKey(arr[i])) {
				int oldFre= hm.get(arr[i]);
				hm.put(arr[i],oldFre+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {5,-1,5,2,2,4,-1,6,-2};
      System.out.println(pairSum(arr,4));
	}

}
