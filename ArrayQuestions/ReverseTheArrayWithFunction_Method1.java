package ArrayQuestions;

public class ReverseTheArrayWithFunction_Method1 {

    public static void reverse(int [] arr) {
    	
        int [] newArray= new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0;i--) {
      	  newArray[j]= arr[i];
      	  j++;
        }
         //copy the Data
        for(int i=0;i<arr.length;i++) {
      	  arr[i]=newArray[i];
        }

//        arr= newArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6};
		reverse(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
