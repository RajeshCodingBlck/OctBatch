import java.util.*;
public class Main {

    public static void getPairs(int [] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target){ 
                 i++;
            }else if(sum>target){
                j--;
            }else{
              System.out.println(arr[i]+" and "+ arr[j]);
              i++;
              j--;
            }
        }

    }
    public static void main(String args[]) {
     
     Scanner s= new Scanner(System.in);
     int n= s.nextInt();
     int [] arr= new int[n];
     for(int i=0;i<n;i++){
         arr[i]=s.nextInt();
     }
     int target= s.nextInt();
     getPairs(arr, target);
    }
}
