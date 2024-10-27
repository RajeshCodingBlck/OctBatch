package Lec4;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int a= s.nextInt();
       int rem= a%2;
       if(rem == 0) {
    	  System.out.println("a is Even"); 
       }
       else {
    	 System.out.println("a is Odd"); 
       }
       
       System.out.println("Hello from outside");
       
       
	}

}
