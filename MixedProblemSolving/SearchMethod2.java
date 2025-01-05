class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

       int i=0;
       int j= arr[0].length-1;

       while(i < arr.length  && j>=0 ){

          if(arr[i][j] ==target){
             return true;
          }else if(arr[i][j]<target){
             i++;
          }else{
             j--;
          }
       }
       return false;
    }

}
