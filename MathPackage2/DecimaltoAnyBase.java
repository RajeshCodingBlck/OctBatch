package MathPackage2;

import java.util.Scanner;

public class DecimaltoAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		   int n= s.nextInt(); // Base 10
		   int b= s.nextInt();
		   int ans=0;
		   int placeValue=1;
		   
		   while(n !=0) {
			   int rem =n %b;
			   ans= rem*placeValue +ans;
			   n=n/b;
			   placeValue= placeValue*10;
		   }
		   System.out.println(ans);
	}

}
