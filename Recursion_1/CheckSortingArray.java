package Recursion_1;

public class CheckSortingArray {

	public static boolean check(int [] arr, int i) {
		
		if(i==arr.length-1) {
			return true;
		}
		boolean chhotaAns=check(arr, i+1);
		if(chhotaAns==false) {
			return false;
		}
		if(arr[i]> arr[i+1]) {
			return false;
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
