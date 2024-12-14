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

    public static boolean isArm(int n){

        if(n== Sum(n)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();

        for(int i=n1; i<=n2;i++){

            if(isArm(i)){
                System.out.println(i);
            }
        }
    }
}
