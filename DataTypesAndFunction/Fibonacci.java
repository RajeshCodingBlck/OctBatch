package DataTypesAndFunction;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      int a=0; // 0th fibonacci
      int b= 1; // 1th fibonacci
      int c=1;
//      System.out.println(c);
      if(n==0) {
    	  System.out.println(a);
      }else if(n==1) {
    	  System.out.println(b);
      }else {
    	  
    	  for(int i=2; i<=n;i++) {
    		  c= a+b;
    		  a=b;
    		  b=c;
    	  }
    	  System.out.println(c);
      }
	}

}
