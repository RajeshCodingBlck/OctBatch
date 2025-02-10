package Recursion_1;

public class ArraySum {

	// Take Array which is Start from i -> return sum of that Array which is Start from i 
	public static int getSum(int [] arr, int i) {
		
		if(i==arr.length) { // -ve Base Case
			return 0;
		}
		int chhotaAns=getSum(arr, i+1);
		int meraAns= arr[i]+chhotaAns;
		return meraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,10,2,3};
        System.out.println(getSum(arr,0));
	}

}
