package Backtracking;

public class BalanceParenthesis {

	public static boolean isValid(String ans) {
		
		int count=0;
		for(int i=0;i<ans.length();i++) {
			if(ans.charAt(i)=='(') {
				count++;
			}else {
				if(count==0) {
					return false;
				}
				count--;
			}
		}
		return count==0;
	}
	public static void printParethesis(int remClosing,
			int remOpening,String ans) {
		
		if(remOpening<0 || remClosing <0) { //-ve
			return;
		}
		if(remOpening==0 && remClosing==0) {
			
			System.out.println(ans);
			return;
		}
		
		if(remOpening > remClosing) {
			return;
		}
		// Opening Bracket
		printParethesis(remClosing, remOpening-1, ans+"(");
		// Closing Bracket
		printParethesis(remClosing-1, remOpening, ans+")");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printParethesis(4, 4, "");
	}

}
