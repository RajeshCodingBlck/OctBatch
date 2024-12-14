import java.util.*;
public class Main {

    public static int DigitCount(int n){

        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static int Sum(int n){
       
       int count=DigitCount(n);

       int sum=0;
       while(n>0){

           int lastDigit=n%10;
           sum += (int)Math.pow(lastDigit, count);

           n=n/10;
       }
       return sum;
    }
    public static void main(String args[]) {
    
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
       int sum= Sum(n);

       if(sum==n){
           System.out.println(true);
       }else{
           System.out.println(false);
       }

    }
}
