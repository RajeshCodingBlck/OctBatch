package StringDemo;

import java.util.Scanner;

public class ReverseTheString {

	public static String reverse(String str) {
		
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans +=str.charAt(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	    Scanner s= new Scanner(System.in);
	    String str= s.next();
	    String ans= reverse(str);
	    System.out.println(ans);
	    
	}

}
