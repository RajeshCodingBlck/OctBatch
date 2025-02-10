package Recursion_1;

public class ReverseTheArray {

	public static void reverse(int [] arr, int i, int j) {
		
		if(i>j) {
			return;
		}
		reverse(arr, i+1, j-1);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6};
       reverse(arr, 0, arr.length-1);
       for(int val : arr) {
    	   System.out.print(val+" ");
       }
      
	}

}
