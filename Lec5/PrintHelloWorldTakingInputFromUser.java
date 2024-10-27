package Lec5;

import java.util.Scanner;

public class PrintHelloWorldTakingInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       
       int i=1;
       while(i<=n) {
    	   System.out.println("Hello World");
    	   i +=1;// i=i+1
       }
       
       
	}

}
