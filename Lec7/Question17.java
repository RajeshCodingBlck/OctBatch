package Lec7;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n=7;
		int nsp=-1;
		int LeftStar=4;
		int rightStar=4;
		int row=1;
		while(row<=7) {
			
			// Work for Left Star
			int i=1;
			while(i<=LeftStar) {
				System.out.print("*"+" ");
				i=i+1;
			}
			// Work for Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			
			// work for RightStar
			int k=1;
			
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=rightStar) {
				System.out.print("*"+" ");
				k=k+1;
			}
			
			if(row<4) {
				LeftStar=LeftStar-1;
				rightStar=rightStar-1;
				nsp=nsp+2;
			}else {
				LeftStar=LeftStar+1;
				rightStar=rightStar+1;
				nsp=nsp-2;
			}
			row=row+1;
			System.out.println();
		}
	}

}
