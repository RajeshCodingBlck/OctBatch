package RecursionwithMulitpleCalls;

public class StairProblem {

	public static void Stairs(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(n<0){
			return;
		}
		// 1 ka Jump
		Stairs(n-1, ans+"1");
		// 2 ka Jump
		Stairs(n-2, ans+"2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stairs(4, "");
	}

}
