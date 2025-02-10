package RecursiveSortingAlgorithms;

public class MergeTwoSortedArray {

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
		
		for(int val : result) {
			System.out.print(val+" ");
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr1= {2,3,10,20};
      int [] arr2= {1,2,3,4,5};
      merge(arr1, arr2);
  
	}

}
