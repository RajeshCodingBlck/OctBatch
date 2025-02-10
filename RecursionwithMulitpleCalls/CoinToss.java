package RecursionwithMulitpleCalls;

public class CoinToss {

	public static void coins(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		// Head
		coins(n-1, ans+"H");
		// Tail
		coins(n-1,ans+"T");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          coins(3, "");
	}

}
