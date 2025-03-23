package HashMapDemo;

import java.util.HashMap;

public class HashMapQuestion1 {

	public static void findFrequency(int [] arr) {
		
		HashMap<Integer, Integer> hm= new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			
			if(hm.containsKey(arr[i])) {
				int oldFre= hm.get(arr[i]);
				hm.put(arr[i], oldFre+1);
			}else {
			   hm.put(arr[i], 1);	
			}
		}
		
//		System.out.println(hm.size());
		
		System.out.println(hm);
		for( int keys: hm.keySet()) {
			
		   System.out.println(keys+ " "+ hm.get(keys));	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,1,3,3,2,4,1,2,5};
      findFrequency(arr);
	}

}
