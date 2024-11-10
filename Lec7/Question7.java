package Lec7;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int  n=5;
		int nst=n;
		int nsp=n-2;
		int row=1;
		while(row<=n) {
			
			// work
			if(row==1 || row==n) {
				
				int i=1;
				while(i<=nst) {
					System.out.print("*"+" ");
					i=i+1;
				}
			}else {
				
				System.out.print("*"+" ");
				
				int i=1;
				while(i<=nsp) {
					System.out.print(" "+" ");
					i=i+1;
				}
				System.out.print("*"+" ");
			}
			//Preparation for Next Row
			nst=nst;
			nsp=nsp;
			row=row+1;
			System.out.println();
		}
		
	}

}
