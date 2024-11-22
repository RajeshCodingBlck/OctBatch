package DoubtClasses;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         
         int row=1;
         int nsp1=0;
         int leftStar=1;
         int nsp2=3;
         int rightStar=1;
         while(row<=n) {
        	 
        	 int i=1;
        	 while(i<=nsp1) {
        		 System.out.print(" "+" ");
        		 i++;
        	 }
        	 
        	 int j=1;
        	 while(j<=leftStar) {
        		 System.out.print("*"+" ");
        		 j++;
        	 }
        	 
        	 int k=1;
        	 while(k<=nsp2) {
        		 System.out.print(" "+" ");
        		 k++;
        	 }
        	 
        	 int p=1;
        	 if(row == n/2+1) {
        		 p=2;
        	 }
        	 while(p<=rightStar) {
        		 System.out.print("*"+" ");
        		 p++;
        	 }
        	 
        	 if(row< n/2 +1) {
        		 
        		 nsp1++;
        		 nsp2 -=2;
        	 }else {
        		 nsp1--;
        		 nsp2+=2;
        	 }
        	 row=row+1;
        	 System.out.println();
         }
	}

}
