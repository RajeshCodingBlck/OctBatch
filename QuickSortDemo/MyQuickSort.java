package QuickSortDemo;

public class MyQuickSort {
   
	public static int partition(int [] arr, int s, int e) {
			
			int pivot=arr[e];
			int index=s;
			for(int i=s; i<e;i++) {
				if(arr[i]>=pivot) {
					continue;
				}else {
					int temp=arr[i];
					arr[i]=arr[index];
					arr[index]=temp;
					index++;
				}
			}
			int temp=arr[index];
			arr[index]=arr[e];
			arr[e]=temp;
			return index;
			
			
	}
	public static void quickSort(int [] arr, int s, int e) {
		
		if(s>=e) {
			return;
		}
		
	   int pivotIndex=partition(arr, s,e);
	   quickSort(arr, s, pivotIndex-1);
	   quickSort(arr,  pivotIndex+1, e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,4,3,5,6,2};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
