package ArrayQuestions;

import java.util.Arrays;

public class InsertionSort {
   
	// i denote Kaha taak Array Sorted he (n-2)
	// temp kisko correct Position par pahu chana he
	public static void  insert(int [] arr, int i, int temp) {
		
		
		while( i>=0 && arr[i]> temp) {
			// shift
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=temp;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {3,1,2,4,3,0,8,1};
       //insert(arr,arr.length-2, arr[arr.length-1] );
       
       for(int i=1; i<arr.length;i++) {
    	   insert(arr, i-1,arr[i] );
       }
       
       Arrays.sort(arr);
       
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
       
	}

}
