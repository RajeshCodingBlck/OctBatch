package ArrayQuestionPart2;

public class BuubleSort {

	public static void bubbleSort(int [] arr) {
		
		for(int round=1; round<arr.length;round++) {
			for(int i=0; i<arr.length-round;i++) {
				if(arr[i+1]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {5,4,3,2,1};
      bubbleSort(arr);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
