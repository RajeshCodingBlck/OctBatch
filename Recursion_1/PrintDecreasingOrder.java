package Recursion_1;

public class PrintDecreasingOrder {

	// Take N -> print  first N number in decreasing Order.
	public static void Dec(int n) {
		
		if(n==0) { // -ve Base
			return;
		}
		System.out.println(n);
		Dec(n-1);	
	}
	
	public static void Inc(int n) {
			
		if(n==0) { // -ve Base
			return;
		}
		Inc(n-1);
		System.out.println(n);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Inc(5);
	}

}
