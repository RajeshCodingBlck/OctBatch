package Lec7;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int row=1;
		
		int leftStar=1;
		int rightStar=1;
	    int nsp=7;
		while(row<=5) {
			
			// work for leftStar
			int i=1;
			while(i<=leftStar) {
				System.out.print("*"+"\t");
				i=i+1;
			}
			// work for Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+"\t");
				j=j+1;
			}
			// work for RightStar
			int k=1;
			if(row==5) {
				k=2;
			}
			while(k<=rightStar) {
				System.out.print("*"+"\t");
				k=k+1;
			}
			// Preparation for Next Row
			leftStar= leftStar+1;
			rightStar=rightStar+1;
			nsp= nsp-2;
			
			row=row+1;
			System.out.println();
		}
	}

}
