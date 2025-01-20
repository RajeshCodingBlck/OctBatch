package WrapperClassDemo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	  ArrayList<Integer> arr= new ArrayList();
	   // Crud
	  arr.add(12);
	  arr.add(13);
	  arr.add(14);
	  System.out.println(arr);
	  // read
	  System.out.println(arr.get(2));
	  // Update
	  System.out.println(arr.set(0, 100));
	  System.out.println(arr);
	  // remove
//	  arr.remove(0);
	  System.out.println(arr);
	  
	  for(int i=0; i<arr.size();i++) {
		  System.out.println(arr.get(i));
	  }
	  
	  for( Integer val :arr) {
		  System.out.println(val);
	  }
	  
	  int [] brr= {1,2,3};
	  for(int val  : brr) {
		  System.out.print(val+" ");
	  }
	  
	  
	}

}
