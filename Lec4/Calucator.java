package Lec4;

import java.util.Scanner;

public class Calucator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int a=s.nextInt();
      int b= s.nextInt();
      int c= s.nextInt();
      
      int sum= a+b+c;
      int Subtraction= a-b-c;
      int multi= a*b*c;
      int quotient= a/b;
      int remainder= a%b;
      
      System.out.println(sum);
      System.out.println(Subtraction);
      System.out.println(multi);
      System.out.println(quotient);
      System.out.println(remainder);
      
	}

}
