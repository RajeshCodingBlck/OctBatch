package HashMapDemo;

import java.util.*;

public class InBuidHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//	  ArrayList<Integer> arr= new ArrayList<>();
	          // key, value
     // HashMap<String,Integer> hm= new HashMap();
      
      // Insert a Data
//      hm.put("Aman", 50);
//      hm.put("Rahul", 60);
//      hm.put("Akash", 70);
//      
//      System.out.println(hm);
//      
//     // access the data/ read the data
//      System.out.println(hm.get("Aman"));
//      System.out.println(hm.get("Akash"));
//      System.out.println(hm.get("Ajit"));
//      
//      System.out.println(hm.getOrDefault("Aman",-100 ));
//      
//      System.out.println(hm.getOrDefault("Ajit",-100 ));
//      
//      
//      hm.remove("Aman");
//      
//      System.out.println(hm);
      
      
      
		HashMap<String,Integer> hm= new HashMap();
		
		hm.put("Aman", 1);
		hm.put("Ajit", 30);
		hm.put("Alok", 30);	
		hm.put("Aman", 50);  // Update
		System.out.println(hm);
      
		
		// Search
		
		System.out.println(hm.containsKey("Amit"));  // kya koi present he ya nahi HashMap me.
		
		// iteration
		int [] arr= {1,2,3,4,5};
		
		for( int val: arr) {
			
			System.out.println(val);
		}
		System.out.println(hm.keySet());
		
		for ( String keys: hm.keySet()) {
			System.out.println(keys+ " "+ hm.get(keys));
		}
		
		for( int val : hm.values()) {
			System.out.println(val);
		}
		
		
		
		 for( Map.Entry<String, Integer>  entry :  hm.entrySet()) {
			 
			 System.out.println(entry.getKey()+ " "+ entry.getValue());
		 }
		 
		 
		
		
		
		
      
      
	}

}
