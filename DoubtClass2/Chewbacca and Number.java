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
                lastDigit=9-lastDigit;
            }
            ans= ans+ placeValue*lastDigit;

          placeValue *= 10;
            n=n/10;
        }
        if(n!=9 && n>=5){
            ans= ans+ (9-n)*placeValue;
        }else{
            ans= ans+ n*placeValue;
        }

        System.out.println(ans);

    }
}
