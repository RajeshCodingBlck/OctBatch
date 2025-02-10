package RecursiveSortingAlgorithms;

public class PartitionAlgorithms {

	public static int partition(int [] arr) {
		
		int n=arr.length;
		int pivot= arr[n-1];
		int index=0;
		for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]>=pivot) {
				 continue;
			 }
			 int temp=arr[i];
			 arr[i]=arr[index];
			 arr[index]=temp;
			 index++;
		}
		int temp=arr[n-1];
		arr[n-1]=arr[index];
		arr[index]=temp;
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,3,2,6,8,5};
       int indexPivot= partition(arr);
       System.out.println(indexPivot);
       for(int val : arr) {
    	   System.out.print(val+" ");
       }
       
	}

}
