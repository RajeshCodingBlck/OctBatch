import java.util.*;
public class Main {

    public static void getPairs(int [] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int r1=-1;
        int r2=-1;
        int difference= Integer.MAX_VALUE;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target){ 
                 i++;
            }else if(sum>target){
                j--;
            }else{
              
              r1=arr[i];
              r2=arr[j];
              i++;
              j--;
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+ r1 +" and "+r2+ ".");

    }

    public static void main(String args[]) {

       Scanner s= new Scanner(System.in);
       int t= s.nextInt();
       while(t>0){

            int n= s.nextInt(); 
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int target= s.nextInt();
            getPairs(arr, target);
            t--;
       }
    }
}
