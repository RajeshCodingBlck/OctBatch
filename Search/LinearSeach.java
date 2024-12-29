package Search;

import java.util.Arrays;

public class LinearSeach {

	public static int linearSearch(int [] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int [] arr, int target) {
		
		int low= 0;
		int high= arr.length-1;
		
		while(low<=high) {
			
			int mid= (low+high)/2;
			
			if(arr[mid]==target) {
				
				return mid;
			}else if(arr[mid]<target) {
				 
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}
	 public static void main(String [] args) {
		 
		 int [] arr= {1,12,10,2,3, 6, 4};
		 int target=11;
		 Arrays.sort(arr);
		 for(int i=0; i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 System.out.println(binarySearch(arr, target));
	 }
}
