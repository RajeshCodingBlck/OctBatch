package Lec_8;

public class PreAndPostIncreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int i=12;
		
//		i=i+1;
//		i++;
		
//		int b= i++;
//		System.out.println(i + " "+ b);
		
//		System.out.println(i--);
//		System.out.println(i--);
		
		int a= i++ -12 + --i - 13 ;
		System.out.println(a+ " "+ i);
		
	}

}
