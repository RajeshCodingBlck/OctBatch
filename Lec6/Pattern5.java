package Lec6;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int row=1;
		
		// Observation
		int nst=1;
		int ndl=4;
		while(row<=5) {
			
			// work
			// work for dollar
			int i=1;
			while(i<=ndl) {
				System.out.print("$"+" ");
				i=i+1;
			}
			// work for Star Print
			
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			
			// Preparation for Next row
			ndl=ndl-1;
			nst= nst+2;
			
			row=row+1;
			System.out.println();
		}
		
	}

}
