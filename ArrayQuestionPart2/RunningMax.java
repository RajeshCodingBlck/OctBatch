package ArrayQuestionPart2;

public class RunningMax {

	public static int [] runningMax(int [] arr) {
		
		int n= arr.length;
		int [] runningMax= new int[n];
		runningMax[0]= arr[0];
		
		for(int i=1; i<n;i++) {	
//	     runningMax[i]= Math.max(runningMax[i-1], arr[i]);
			
			if(runningMax[i-1]>arr[i]) {
				runningMax[i]= runningMax[i-1];
			}else {
				runningMax[i]=arr[i];
			}
		}
		return runningMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,3,2,6,5,10,12,8,19};
      
      // Inbuit function
      // Max function
//       System.out.println(Math.max(120, 13));
//       System.out.println(Math.min(120, 30));
//       // pow
//       System.out.println((int)Math.pow(2, 3)); //2^3
      
       int [] ans= runningMax(arr);
       System.out.println(ans);
      
	}

}
