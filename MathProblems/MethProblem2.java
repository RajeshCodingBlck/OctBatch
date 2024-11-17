package MathProblems;

public class MethProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	    int n=56789;
	    
	    int reverseAns=0;
	    while(n!=0) {
	    	int lastDigit=n%10;
	    	reverseAns=reverseAns*10+lastDigit;
	    	n= n/10;
	    }
	    System.out.println(reverseAns);
	}

}
