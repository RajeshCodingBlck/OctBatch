package Lec6;

public class Pattern1NewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int row=1;
		// Observe the 1st Row
		int nst=1;
		while(row<=5) {
			
			// work
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			
			// preparation for Next row
			nst=nst+1;
			row=row+1;
			System.out.println();
		}
		
	}

}
