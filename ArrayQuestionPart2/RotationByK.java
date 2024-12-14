package ArrayQuestionPart2;

public class RotationByK {

	 public static void reverseInRange(int[] arr, int l, int r) {
			int i = l;// Starting Point
			int j = r; // Ending Point
			while (i <= j) {
				// Swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
	   public static void rotate(int[] nums, int k) {
	        
	        k= k%nums.length;
	        reverseInRange(nums, 0, nums.length-1);
	        reverseInRange(nums, 0,k-1);
	        reverseInRange(nums, k, nums.length-1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6};
       rotate(arr, 3);
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
	}

}
