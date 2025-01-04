package BinarySearchQuestions;

public class FirstOccurenceOfTarget {

	
	public static int lastOccurence(int [] arr, int target) {
		
		int low=0;
		 int high= arr.length-1;
		 int potentialCandidate=-1;
		 
		 while(low<=high) {
			 
			 int mid= (low+high)/2;
			 
			 if(arr[mid]==target) {
				 potentialCandidate=mid;
				 low=mid+1;
				 
			 }else if(arr[mid]<target) {
				 
				 low=mid+1;
			 }else {
				 
				 high=mid-1;
			 }
		 }
		 return potentialCandidate;
		
	}
	public static int FirstOccurence(int [] arr, int target) {
		
		 int low=0;
		 int high= arr.length-1;
		 int potentialCandidate=-1;
		 
		 while(low<=high) {
			 
			 int mid= (low+high)/2;
			 
			 if(arr[mid]==target) {
				 potentialCandidate=mid;
				 high=mid-1;
				 
			 }else if(arr[mid]<target) {
				 
				 low=mid+1;
			 }else {
				 
				 high=mid-1;
			 }
		 }
		 return potentialCandidate;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {2,2,2,2,2,2,3,4,5,5,7};
      int target=2;
      System.out.println(FirstOccurence(arr, target));
      System.out.println(lastOccurence(arr, target));
	}

}
