package MathPackage2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	    Scanner s= new Scanner(System.in);
	    
	    int n= s.nextInt(); // Base 2
	    
	    int ans=0;
	    int placeValue=1;
	    
	    while(n!=0) {
	    	int lastDigit= n%10;
	    	 ans= ans+ lastDigit*placeValue; 
	    	 n=n/10;
	    	 placeValue= placeValue*2;
	    }
	    System.out.println(ans);
	   
	}

}
