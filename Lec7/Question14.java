package Lec7;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int row=1;
		int nst=5;
		int nsp=0;
		while(row<=9) {
			
			// work
			// Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			// Star
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			// Preparation for Next row
			if(row<5) {
				nsp=nsp+2;
				nst=nst-1;
			}else {
				nsp=nsp-2;
				nst=nst+1;
			}
			row=row+1;
			System.out.println();
		}
		
	}

}
