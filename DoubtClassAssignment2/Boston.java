import java.util.*;
public class Main {

    public static int digitSum(int n){

        int sum=0;
        while(n !=0){
            int ld= n%10;
            sum+=ld;
            n=n/10;
        }
        return sum;
    }
   
     public static boolean isPrime(int n){

         int count=0;
         for(int i=1;i<=n;i++){
             if(n%i==0){
                 count++;
             }

             if(count>2){
                 return false;
             }
         }
         if(count==2){
             return true;
         }else{
             return false;
         }
     }
    public static int sumOfDigitofPrimeFactor(int n){

        // work
         int sum=0;
        for(int i=2; i<=n;i++){

            if(n%i==0 && isPrime(i)){
                 
                 int count=0;
                 while(n%i==0){
                     count++;
                     n=n/i;
                 }
             sum = sum+  digitSum(i)*count;
            }
        }
        return sum;
    }
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        if(digitSum(n) == sumOfDigitofPrimeFactor(n)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
