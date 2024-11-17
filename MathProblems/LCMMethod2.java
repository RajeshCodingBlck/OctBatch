package MathProblems;

public class LCMMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 4;
		int b=10;
		
		for(int i=1; i<=a*b;i++) {
			
			if(i%a ==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
