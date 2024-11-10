package Lec_8;

import java.util.Scanner;

public class NCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int r= s.nextInt();
		
//		NCR= N! / (R!)*(N-R)!
		int nFactorial=1;
		int rFactorial=1;
		int nMinusr_Factorial=1;
		
		for(int i=1;i<=n;i=i+1) {
			nFactorial= nFactorial*i;
		}
		
		for(int i=1; i<=r;i=i+1) {
			rFactorial= rFactorial*i;
		}
		
		for(int i=1; i<= (n-r);i=i+1) {
			nMinusr_Factorial *=i;
		}
		
		int ncr=  nFactorial / 
				(rFactorial * nMinusr_Factorial);
		
		System.out.println(ncr);
		
		
		
	}

}
