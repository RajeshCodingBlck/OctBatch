package StringDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int [] arr= new int[5];
		// Method1
		String str= new String("Hello");
		
		// Method2 (String literal Method)
		String str2= "Hello";
		
		System.out.println(str);
		
		
		// InBuit
		System.out.println(arr.length);
		System.out.println(str.length());
		
		// character at Any Index
		System.out.println(str.charAt(0));
		
		// substring 
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,3));
		System.out.println("Hello2");
		
		
		// .equal => content 
		System.out.println(str.equals(str2));
		
		
	}

}
