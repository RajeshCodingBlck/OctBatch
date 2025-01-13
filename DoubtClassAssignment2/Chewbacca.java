import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here

         Scanner s= new Scanner(System.in);
         long n= s.nextLong();

         long ans=0;
         long placeValue=1;
         while(n>=10){

            long lastDigit= n%10;
            if(lastDigit>=5){
                lastDigit= 9-lastDigit;
            } 
            ans= lastDigit*placeValue+ ans;
            n=n/10;
            placeValue= 10*placeValue;
         }

         if(n<5 || n==9){
             ans= ans+ n*placeValue;
         }else{
             n= 9-n;
              ans= ans+ n*placeValue;
         }
         System.out.println(ans);

    }
}
