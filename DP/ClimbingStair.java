package DP;

public class ClimbingStair {

	public static int climbingStairs(int n) {

//		if(n==0 || n==1) {
//			return 1;
//		}

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		// 1 ka Jump
		int ans1 = climbingStairs(n - 1);
		// 2 ka Jump
		int ans2 = climbingStairs(n - 2);

		int meraAns = ans1 + ans2;
		return meraAns;

	}

	public static int climbingStairs(int n, int [] brain) {

//		if(n==0 || n==1) {
//			return 1;
//		}

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		
		if(brain[n] !=0) {
			return brain[n];
		}

		// 1 ka Jump
		int ans1 = climbingStairs(n - 1);
		// 2 ka Jump
		int ans2 = climbingStairs(n - 2);

		int meraAns = ans1 + ans2;
//		brain[n]= meraAns;
//		return meraAns;
          return brain[n]=meraAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] brain = new int[6];
//		System.out.println(climbingStairs(5, brain));
		
		int ans=10;
		System.out.println(ans>3);
	}

}
