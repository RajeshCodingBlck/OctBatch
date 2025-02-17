package RecursionwithMulitpleCalls;

import java.util.ArrayList;

public class SubsequenceProbRevise {

//	static int count=0;
	public static int subsequence(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
//			count++;
			return 1;
		}
		
		char ch= str.charAt(0);
		String smallString = str.substring(1);
		// 0th index char ko pick karu
		int count1=subsequence(smallString, ans+ch);
		// 0th index char ko pick na Karu
		int count2= subsequence(smallString, ans);
		return count1+count2;
		
	}
	
	public static void subsequence(String str, ArrayList<Character> ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch= str.charAt(0);
		String smallerString= str.substring(1);
		subsequence(smallerString, ans);
		ans.add(ch);
		subsequence(smallerString, ans);
		ans.remove(ans.size()-1);
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str= "abc";
         int count = subsequence(str, "");
           System.out.println(count);
		  ArrayList<Character> ans= new ArrayList();
		  subsequence("abc", ans);
		  
	}

}
