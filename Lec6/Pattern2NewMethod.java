package Lec6;

public class Pattern2NewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int row=1;
		int nst=5;
		while(row<=5) {
			
			// work
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			
			// Preparation for Next row
			nst=nst-1;
			row=row+1;
			System.out.println();
		}
		
	}

}
