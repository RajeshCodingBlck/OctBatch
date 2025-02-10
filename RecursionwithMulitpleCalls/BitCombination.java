package RecursionwithMulitpleCalls;

public class BitCombination {
    
	public static void combination(int n, String ans) {
		
		if(n==0) {
		   System.out.println(ans);
		   return;
		}
		combination(n-1, ans+"0");
		combination(n-1, ans+"1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination(3, "");
	}

}
