package DP;

import java.util.HashMap;

public class Fibo {

	public static int fibo(int n) {

//		if(n==0) {
//			return 0;
//		}
//		if(n==1) {
//			return 1;
//		}

		if (n == 0 || n == 1) {
			return n;
		}
		System.out.println( " N is "+ n);
		int chhotaAns1 = fibo(n - 1);
		int chhotaAns2 = fibo(n - 2);
		int meraAns = chhotaAns1 + chhotaAns2;
		return meraAns;
	}

	public static int fibo(int n, HashMap<Integer, Integer> brain) {

//		if(n==0) {
//			return 0;
//		}
//		if(n==1) {
//			return 1;
//		}

		if (n == 0 || n == 1) {
			return n;
		}
		
		if(brain.containsKey(n)) {
			return brain.get(n);
		}
		System.out.println( " N is "+ n);
		int chhotaAns1 = fibo(n - 1, brain);
		int chhotaAns2 = fibo(n - 2, brain);
		int meraAns = chhotaAns1 + chhotaAns2;
		brain.put(n, meraAns);
		return meraAns;
	}
	
	public static int fibo(int n, int [] brain) {

//		if(n==0) {
//			return 0;
//		}
//		if(n==1) {
//			return 1;
//		}

		if (n == 0 || n == 1) {
			return n;
		}
		
		if(brain[n] !=0) {
			return brain[n];
		}
		System.out.println( " N is "+ n);
		int chhotaAns1 = fibo(n - 1, brain);
		int chhotaAns2 = fibo(n - 2, brain);
		int meraAns = chhotaAns1 + chhotaAns2;
		brain[n]= meraAns;
		return meraAns;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> brain = new HashMap();
		int [] brain2= new int[14];
		System.out.println(fibo(13, brain2));

	}

}
