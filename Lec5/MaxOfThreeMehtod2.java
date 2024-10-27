package Lec5;

import java.util.Scanner;

public class MaxOfThreeMehtod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("a is Max");
		}else if(b>c) {
			System.out.println("b is Max");
		}else {
			System.out.println("c is Max");
		}
		
		
		

//	      if else if
//	     if() {
//	    	 
//	     }else if() {
//	    	 
//	     }else if() {
//	    	 
//	     }else if() {
//	    	 
//	    	 
//	     }else {
//	    	 
//	     }

		// Example for if else if

//	      int val=12;
//	        
//	        if(val==12){
//	            System.out.println("1st if is run");
//	        }else if(val==12){
//	            System.out.println("2nd if is run");
//	        }else if(val==12){
//	            System.out.println("3rd if is run");
//	        }else {
//	            System.out.println("else is run");
//	      }
	}

}
