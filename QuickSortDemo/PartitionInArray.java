package QuickSortDemo;

public class PartitionInArray {

	
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
	public static int partition(int [] arr) {
		
		int n=arr.length;
		int pivot= arr[n-1];
		int index=0;
		for(int i=0;i<n-1;i++) {
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
		arr[index]=arr[n-1];
		arr[n-1]=temp;
		return index;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {6,1,14,13,7};
       int index=partition(arr,1,3);
       System.out.println(index);
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
        
	}

}
