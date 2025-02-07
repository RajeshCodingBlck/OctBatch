import java.util.*;
public class Main {
    public static boolean isPossible(int [] arr, int k, int t){

        int  count=1; // kitne Painter chahiye
        int  KitneTimePaintKarliyaHe=0;
        for(int i=0;i<arr.length;i++){

            if(KitneTimePaintKarliyaHe + arr[i]>t){
                count++;
                KitneTimePaintKarliyaHe = arr[i];
            }else{
                KitneTimePaintKarliyaHe += arr[i];
            }

            if(count>k){
                return false;
            }
        }
        return true;

    }
    public static int Bs(int [] arr, int k, int n){
      int maxVal=0;
      int sum=0;
      for(int val : arr){
         maxVal=Math.max(maxVal,val);
         sum+=val; 
      }
      int low=maxVal;
      int high=sum;
      int ans=-1;
      while(low<=high){
          int mid= (low+high)/2;
          if(isPossible(arr, k,mid)==true){
                ans=mid;
                high=mid-1;
          }else{
               low=mid+1;
          }
      }
      return ans;
    }
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      while(t>0){
            int n=s.nextInt(); // Number of Boards
            int k=s.nextInt();// Number of Painters
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt(); // Length of each board
            }
            int ans= Bs(arr,k,n);
            System.out.println(ans);
            t--;
      }
    }
}
