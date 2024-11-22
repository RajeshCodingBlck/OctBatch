import java.util.*;
public class Main {
    public static void main(String args[]) {
       
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();

       int row=1;
       int leftStar=1;
       int nsp=2*n-3;
       int rightStar=1;

       int rolValLeft=1;
       int rolValRight=1;

       while(row<=n){

           // work
          // work for LeftStar
           int i=1;
           int colValLeft= rolValLeft;
           while(i<=leftStar){
               System.out.print(colValLeft+ "\t");
               i=i+1;
               colValLeft++;
           }

           // work for  Space
           int j=1;
           while(j<=nsp){
               System.out.print(" "+"\t");
               j=j+1;
           }

           // work for RightStar
           int k=1;
           if(row==n){
               k=2;
               rolValRight--;
           }
           int colValRight=rolValRight;
           
           while(k<=rightStar){
               System.out.print(colValRight+"\t");
               k=k+1;
               colValRight--;
           }

           // Preparation for the Next Row
            leftStar++;
            rightStar++;
            nsp-=2;
            rolValLeft= rolValLeft+0;
            rolValRight= rolValRight+1;

           row=row+1;
           System.out.println();
       }
    }
}
