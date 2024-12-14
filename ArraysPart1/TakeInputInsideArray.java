package ArraysPart1;

import java.util.Scanner;

public class TakeInputInsideArray {

	public static void Display(int [] arr) {
		
		int n= arr.length;// Size of Array.
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       int [] arr=new int[n];
     
//       System.out.println(" Array Size is "+ arr.length);
       // Input Inside the Array...
       for(int i=0; i<n;i++){
    	   arr[i]= s.nextInt();
       }
       
//       // Print the Array
//      // System.out.println(arr); Aase Array print nahi hote.
//       for(int i=0; i<n;i++) {
//    	   System.out.print(arr[i]+ " ");
//       }
       
       // Function+ Array
       
         Display(arr); // Call the Display function passing the address.
       
	}

}
