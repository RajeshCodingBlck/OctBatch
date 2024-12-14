package ArrayQuestionPart2;

public class MinimumIndex {

	public static int minIndex(int[] arr, int l, int r) {

		int min = arr[l];
		int index=l;
		for (int i = l+1; i <=r; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index=i;
			}
		}
		return index;
	}
	public static int minIndex(int[] arr) {

		int min = arr[0];
		int index=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,12,10,4,5,2};
     // System.out.println(minIndex(arr,0,4));
      
     for(int i=0; i<arr.length;i++) {
    	 int minIndex= minIndex(arr, i, arr.length-1);
    	 int temp=arr[minIndex];
    	 arr[minIndex]=arr[i];
    	 arr[i]=temp;
     }
     
     for(int i=0; i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
     
     
	}

}
