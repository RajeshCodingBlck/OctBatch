class Solution {

    public boolean isPossible(int [] piles, int h,int k){

        int totalTime=0;
        for(int i=0;i<piles.length;i++){

            int currTime= piles[i]/k;
            if(piles[i]%k !=0){
                currTime++;
            }
            totalTime+=currTime;
            if(totalTime>h){
                return false;
            }
        }
        if(totalTime<=h){
            return true;
        }else{
            return false;
        }
    }
    public int maxInArray(int [] arr){

        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
       int maxValue= maxInArray(piles);

       int low=1;
       int high= maxValue;

       int potentialCandiate=-1;
       while(low<=high){

        int mid= (low+high)/2;

        if(isPossible(piles, h, mid)==true){
            potentialCandiate=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return potentialCandiate;
        // for(int k=1;k<= maxValue;k++){

        //     if(isPossible(piles, h, k)==true){
        //           return k;
        //     }else{
        //          continue;
        //     }
        // }

        // return -1;
        
    }
}
