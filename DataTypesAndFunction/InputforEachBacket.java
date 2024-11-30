package DataTypesAndFunction;

import java.util.Scanner;

public class InputforEachBacket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
//       int a= s.nextInt();
//       long b= s.nextLong();
//       
//       boolean bd= s.nextBoolean();
//       double d= s.nextDouble();
//       
//       char ch= s.next().charAt(0);
       
        char ch= s.next().charAt(0);
        char ans= (char)(ch+ ('a'-'A'));
        System.out.println(ans);
       
       
	}

}
