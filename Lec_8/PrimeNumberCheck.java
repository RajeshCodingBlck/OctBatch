package Lec_8;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int count=0; // Is N ke Kitne Factor he.
		for(int i=1;i<=n;i=i+1) {
			
			if(n%i ==0) {
				count=count+1;
			}
			
			if(count==3) {
				break;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
	}

}
