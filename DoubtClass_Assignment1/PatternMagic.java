import java.util.*;

public class Main{
    public static void main(String [] args){
     
     Scanner s= new Scanner(System.in);

     int n= s.nextInt();

     int row=1;
     int nsp2= -1;
     int leftStar=n;
     int rightStar=n;

     while(row<=2*n-1){

      // work for LeftStar
      int j=1;
     
      while(j<=leftStar){
          System.out.print("*");
          j=j+1;
      }

      // work for Inner Space
      int k=1;
      while(k<=nsp2){
          System.out.print(" ");
          k=k+1;
      }

      // work for RightStar
      int p=1;

      if(row==1 || row == 2*n-1){
          p=2;
      }
      while(p<=rightStar){
          System.out.print("*");
          p++;
      }

      // preparation for Next row

       if( row <n){
          nsp2 +=2;
          leftStar--;
          rightStar--;
        //   rowValLeft++;
       }else{
          nsp2 -=2;
          leftStar++;
          rightStar++;
        //   rowValLeft--;
       } 


         row=row+1;
         System.out.println();
     }

    }
}
