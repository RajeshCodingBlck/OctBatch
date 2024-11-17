package MathProblems;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int divisor=17;
		int dividend=30;
		int dummy1=divisor;
		int dummy2=dividend;
		int rem= dividend%divisor;
		while( rem !=0) {
			//int rem= dividend%divisor;
			dividend= divisor;
			divisor=rem;
			rem= dividend%divisor;
		}
		System.out.println(divisor);
		System.out.println(dividend);
		int lcm= (dummy1*dummy2)/ divisor;
		System.out.println(lcm);
	}

}
