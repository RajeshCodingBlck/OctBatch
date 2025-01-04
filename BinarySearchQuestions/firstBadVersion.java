//package ArraysPart1;
//
///* The isBadVersion API is defined in the parent class VersionControl.
//boolean isBadVersion(int version); */
//
//public class Solution extends VersionControl {
//public int firstBadVersion(int n) {
//
// int low= 1;
// int high=n;
// int PotentialCandiate=n;
// while(low<=high){  
//    int mid=  low+ (high-low)/2;
//    //System.out.println(mid);
//    if(isBadVersion(mid)){
//         PotentialCandiate=mid;
//        high=mid-1;
//
//    }else{
//         low=mid+1;
//    }
// }
// return PotentialCandiate;
//}
//}
//public class firstBadVersion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package BinarySearchQuestions;


