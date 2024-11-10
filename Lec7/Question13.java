package Lec7;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int row=1;
		int nst=1;
		while(row<=9) {
			
			// work
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			// Preparation for Next row
			if(row<5) {
				nst=nst+1;
			}else {
				nst=nst-1;
			}
			row=row+1;
			System.out.println();
		}
		
	}

}
