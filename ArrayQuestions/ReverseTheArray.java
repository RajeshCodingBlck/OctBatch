package ArrayQuestions;

public class ReverseTheArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5,6};
      
      for(int i= arr.length-1; i>=0;i--) {
    	  System.out.print(arr[i]+" ");
      }
      
      int [] newArray= new int[arr.length];
      
      int j=0;
      
      for(int i=arr.length-1; i>=0;i--) {
    	  newArray[j]= arr[i];
    	  j++;
      }
      
      // copy the Data
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=newArray[i];
      }
      arr= newArray;
      
      
      
	}

}
