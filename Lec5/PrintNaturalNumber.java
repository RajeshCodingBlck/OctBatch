package Lec5;

import java.util.Scanner;

public class PrintNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       
       int i=1;
       // ith Natural Number ko print karenge.
       while(i<=n) {
    	   System.out.println(i);
    	   i+=1;
       }
       
       
	}

}
