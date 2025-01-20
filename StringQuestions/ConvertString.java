package StringQuestions;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		String str= s.next();
		String ans="";
		for(int i=0;i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch = (char)(ch+ ('a'-'A'));
			}else {
				ch = (char)(ch -('a'-'A'));
			}
			ans+=ch;
		}
		System.out.println(ans);
		
	}

}
