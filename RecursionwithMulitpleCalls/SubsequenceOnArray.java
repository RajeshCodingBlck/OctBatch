package RecursionwithMulitpleCalls;

import java.util.ArrayList;

public class SubsequenceOnArray {

	public static void subseq(int [] arr, int i,ArrayList<Integer> ans
			,int target, int sum) {
		
		if(i==arr.length) {
			if(sum<=target) {
				System.out.println(ans+ " "+sum);
			}
			return;
		}
		
		if(sum>target) {
			return;
		}
		
		ans.add(arr[i]);
		subseq(arr, i+1, ans, target, sum+arr[i]);
		ans.remove(ans.size()-1);
		
		subseq(arr, i+1, ans, target, sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,6,7,1,2,3};
       ArrayList<Integer> ans= new ArrayList();
       int target=7;
       subseq(arr, 0, ans, target, 0);
       
	}

}
