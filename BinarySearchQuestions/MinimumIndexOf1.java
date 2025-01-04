package BinarySearchQuestions;

public class MinimumIndexOf1 {

	public static int minimumIndexOfOne(int [] arr) {
		
		int low=0;
		int high= arr.length-1;
		
		int potentialCandidate=-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]==1) {
				potentialCandidate=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return potentialCandidate;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int [] arr= {0,0,0,0,0,1,1,1,1,1};
//		int [] arr= {1,1,1,1,1};
		int [] arr= {0,0,0,0};
     int Index= minimumIndexOfOne(arr);
     System.out.println(Index);
	}

}
