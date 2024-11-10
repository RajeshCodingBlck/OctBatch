package Lec7;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
	    int nst=9;
	    int nsp=0;
		while(row<=5) {
			// work
			// Space
			 int i=1;
			 while(i<=nsp) {
				 System.out.print(" "+" ");
				 i=i+1;
			 }
			 // Star
			 int j=1;
			 while(j<=nst) {
				 System.out.print("*"+" ");
				 j=j+1;
			 }
			 // Preparation for Next Row
			 nsp=nsp+1;
			 nst=nst-2;
			row=row+1;
			System.out.println();
		}
	}

}
