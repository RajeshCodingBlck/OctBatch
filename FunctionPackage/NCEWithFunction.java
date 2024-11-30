package FunctionPackage;

import java.util.*;
public class NCEWithFunction {

	public static int factorial(int val) {
		
		  int ans=1;
		  for(int i=1;i<=val;i++) {
			  ans= ans*i;
		  }
		  return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       int r= s.nextInt();
       
       int nFactorial= factorial(n);
       int rFactorial= factorial(r);
       int nMinusrFactorial= factorial(n-r);
       
       int ncr= nFactorial/ (rFactorial*nMinusrFactorial);
       System.out.println(ncr);
      
	}

}
