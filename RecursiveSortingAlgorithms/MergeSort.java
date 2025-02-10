package RecursiveSortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
  
public static int [] merge(int [] arr1, int []arr2 ) {
		
		int n=arr1.length;
		int m=arr2.length;
		int [] result= new int [n+m];
		int index=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				result[index]=arr1[i];
				index++;
				i++;
			}else {
				result[index]=arr2[j];
				index++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			result[index]=arr1[i];
			index++;
			i++;
		}
		
		while(j<arr2.length) {
			result[index]=arr2[j];
			index++;
			j++;
		}
		
		return result;
	}
	public static int [] mergeSort(int [] arr, int s, int e) {
		
		if(s>=e) {
			int [] baseArray= new int[1];
			baseArray[0]=arr[s];
			return baseArray;
		}
		int mid= (s+e)/2;
		int [] left=mergeSort(  arr, s, mid);
		int [] right=mergeSort(  arr, mid+1, e);
		int [] meraAns= merge(left, right);
		return meraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,3,1,4,1,5,6};
      
       Arrays.sort(arr);
      int [] ans=mergeSort(arr, 0, arr.length-1);
      for(int val :ans) {
    	  System.out.print(val+" ");
      }
      
      
	}

}
