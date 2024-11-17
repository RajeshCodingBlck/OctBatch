package MathPackage2;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n= 1200056;
		
		int ans=0;
		int placeValue=1;
		
		while(n!=0) {
			  int lastDigit=n%10;
			  if(lastDigit !=0) {
				  ans =  lastDigit*placeValue + ans;
			  }else {
				  ans= 8*placeValue + ans;
			  }
			  n=n/10;
			  placeValue= placeValue*10;
		}
		System.out.println(ans);
	}

}
