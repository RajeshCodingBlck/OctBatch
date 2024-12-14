package ArraysPart1;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int a= s.nextInt();
      int b= s.nextInt();
      
      System.out.println("Before Swap "+ a+ " , "+ b);
      int temp=a;
      a=b;
      b=temp;
      System.out.println("After Swap "+ a+ " , "+ b);
      
	}

}
