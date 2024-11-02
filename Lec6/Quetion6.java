package Lec6;

public class Quetion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int row=1;
		int nsp=4;
		int nst=1;
		while(row<=5) {
			
			// work
			// work for Space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			
			// work for Star
			int j=1;
			while(j<=nst) {
				if(j%2==0) {
					System.out.print(" "+" ");
				}else {
					System.out.print("*"+" ");
				}
				j=j+1;
			}
			
			// Preparation for Next row
			nsp=nsp-1;
			nst=nst+2;
			row=row+1;
			System.out.println();
			
		}
	}

}
