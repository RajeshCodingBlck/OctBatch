import java.util.*;

public class Main{
    public static void main(String [] args){
     
     Scanner s= new Scanner(System.in);

     int n= s.nextInt();

     int row=1;
     int nsp1= n-1;
     int nsp2= -1;
     int leftStar=1;
     int rightStar=1;

     int rowValLeft=1;
     int rowValRight=1;
     while(row<=n){

       // work
        //  work for Left Space
        int i=1;
        while(i<=nsp1){
             System.out.print(" "+" ");
             i++;
        }
      // work for LeftStar
      int j=1;
      int colValLeft=rowValLeft;
      while(j<=leftStar){
          System.out.print(colValLeft+" ");
          colValLeft--;
          j=j+1;
      }

      // work for Inner Space
      int k=1;

     
      while(k<=nsp2){
          System.out.print(" "+" ");
          k=k+1;
      }

      // work for RightStar
      int p=1;
      int colValRight= rowValRight;
       if(row==1 || row==n){
          p=2;
      }
      while(p<=rightStar){
          System.out.print(colValRight+" ");
          colValRight++;
          p++;
      }

      // preparation for Next row

       if( row <n/2 +1){
          nsp1 -=2;
          nsp2 +=2;
          leftStar++;
          rightStar++;
          rowValLeft++;
       }else{
            nsp1 +=2;
          nsp2 -=2;
          leftStar--;
          rightStar--;
          rowValLeft--;
       } 


         row=row+1;
         System.out.println();
     }

    }
}
