package Recursion_1;

public class PrintTheArray {

	// Take an Array arr -> print that Array
	public static void print(int [] arr) {
		
		if(arr.length==0) {
			return ;
		}
		
		System.out.print(arr[0]+" ");
		
		int [] smallerArr=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallerArr[i-1]=arr[i];
		}
		print(smallerArr);
	}
	
	// Take i se Start hone Vale Array Print.
	public static void print(int [] arr, int i) {
		
		if(i==arr.length) {
			return ;
		}
		System.out.print(arr[i]+" ");
		print(arr, i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      print(arr,0);
	}

}
