package BinarySearchQuestions;

public class Equationx2lessThanN {

	
	public static double getMaxX(int N) {
		
		double low=1;
		double high=N;
		double potentialCandidate=-1;
//		while(low<=high) {
//			
//			int mid= (low+high)/2;
//			
//			if(mid*mid<=N) {
//				potentialCandidate=mid;
//				low=mid+1;
//			}else {
//				high=mid-1;
//			}
//		}
		 
		for(int i=1;i<=40; i++) {
			double mid= (low+high)/2;
			if(mid*mid<=N) {
				potentialCandidate=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return potentialCandidate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N=1000;
        System.out.println(getMaxX(N));
	}

}
