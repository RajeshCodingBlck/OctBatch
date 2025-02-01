package TimeComplexityPackage;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=100000;
      
      for(int i=1;i<=n;i++) {
    	  System.out.println("Hello");
      }
      // Tc -> O(N)
      
      for(int i=1;i<=n;i*=2) {
    	  System.out.println("Hello");
      }
//      Tc -> O(logn)
      
      for(int i=n;i>=1;i=i/2) {
    	  System.out.println("Hello");
      }
//      Tc -> O(logn)
      
//      int i=1;
//      while(i<=n) {
//    	  System.out.println("Hello");
//    	  i=i*2;
//    	  i=i*3;
//      }
      // TC -> O(log n base 6)
      
      
      for(int i=1;i<=n;i++) {
    	  for(int j=1;j<=n;j++) {
    		  System.out.println("Hello");
    	  }
      }
      // TC -> O(N^2)
      
      for(int i=1;i<=n;i++) {
    	  for(int j=1;j<=n;j*=2) {
    		  System.out.println("Hello");
    	  }
      }
      // TC O(nlogn base 2)
      
      for(int i=1;i<=n;i*=2) {
    	  for(int j=n; j>=1; j/=2) {
    		  System.out.println("Hello");
    	  }
      }
      // TC O(logn *logn => (log n)^2)
      
      for(int i=1;i<=n;i++) {
    	  for(int j=1;j<=n;j+=i) {
    		  System.out.println("Hello");
    	  }
      }
      // TC -> O(nlogn base 2)
      
      int i=1;
      while(i<=n) {
    	  int j=i;
    	  while(j>0) {
    		  j=j/2;
    	  }
    	  i++;
      }
      
      
      
      
      
	}

}
