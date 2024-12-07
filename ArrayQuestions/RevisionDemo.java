package ArrayQuestions;

public class RevisionDemo {

	// Case 1
	public static void swap(int a, int b) {
		
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void swap2(int [] a, int [] b) {
		
		int [] temp=a;
		a=b;
		b=temp;
	}
	public static void swap3(int [] a, int []b) {
		
		int temp=a[0];
		a[0]=b[0];
		b[0]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//int [] arr= new int [5];
//		int a=12;
//		int b=13;
//		System.out.println("Before Swap "+ a+ " "+ b);
//		swap(a,b);
//		System.out.println("After Swap "+ a+ " "+ b);
		
		int [] a= {1,2,3};
		int [] b= {10,20,30};
		System.out.println("Before Swap "+ a[0]+ " "+ b[0]);
		//swap2(a,b);
		swap3(a,b);
		System.out.println("After Swap "+ a[0]+ " "+ b[0]);
		
	
		
	}

}
