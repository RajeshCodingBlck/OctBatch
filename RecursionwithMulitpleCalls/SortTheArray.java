package RecursionwithMulitpleCalls;

public class SortTheArray {

	public static void  sort(int [] arr, int i) {
		
		if(i==arr.length) {
			return;
		}
		sort(arr, i+1);
		for(int j=i+1; j<arr.length;j++) {
			if(arr[j-1]> arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}else {
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,4,1,2,1};
      sort(arr, 0);
      for(int val : arr) {
    	  System.out.print(val+" ");
      }
	}

}
