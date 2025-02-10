package RecursionwithMulitpleCalls;

public class SubsequenceProblem {

	public static void printSubsequence(String str,String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		printSubsequence(str.substring(1), ans+ch);
		printSubsequence(str.substring(1), ans+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printSubsequence("abc", "");
		
		String str="Hello";
		System.out.println(str.substring(1, 3));
	}

}
