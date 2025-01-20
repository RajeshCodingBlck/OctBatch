package StringQuestions;

import java.util.Scanner;

public class IdentidyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner s= new Scanner(System.in);
		
		char ch= s.next().charAt(0);
		if(ch>=65 && ch<=90) {
			System.out.println("UpperCase");
		}else {
			System.out.println("LowerCase");
		}
		
		if(ch>='A' && ch<='Z') {
			System.out.println("UpperCase");
		}else {
			System.out.println("LowerCase");
		}
	}

}
