package Revision;

import java.util.Scanner;

public class QueryProblem2 {

	public static int[] PrefixArray(int[] arr) {

		int[] prefix = new int[arr.length];
		prefix[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Scanner s= new Scanner(System.in);
	  int n=5;
	  int [] arr= new int[n];
	  
	  int q= s.nextInt();
	  
	  while(q>0) {
		  
		  int l= s.nextInt();
		  int r= s.nextInt();
		  int x=s.nextInt();
		  if(r==n-1) {
			  
			  arr[l]+=x;
		  }else {
			  arr[l]+=x;
			  arr[r+1]-=x;
		  }
		  q--;
	  } 
	  int [] prefix= PrefixArray(arr);
	  for(int i=0;i<n;i++) {
		  System.out.print(prefix[i]+" ");
	  }
	  
	  
	}

}
