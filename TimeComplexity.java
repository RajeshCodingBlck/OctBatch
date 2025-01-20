
public class TimeComplexity {

	public static int sum(int n) {
		
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans+=i;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		long startTime= System.nanoTime();
		int ans= sum(100000);
		long endTime= System.nanoTime();
		System.out.println(endTime-startTime);
		
	}

}
