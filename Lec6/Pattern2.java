package Lec6;

import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt(); 
      // Kitni row print karne he aur kitne Star har row me.
      
      int row=1;
      while(row<=n) {
    	  // work
    	  int i=1;
    	  while(i<=n) {
    		  System.out.print("*"+" ");
    		  i=i+1;
    	  }
    	  row=row+1;
    	  System.out.println();
      }
      
      
	}

}
