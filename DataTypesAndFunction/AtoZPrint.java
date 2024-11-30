package DataTypesAndFunction;

public class AtoZPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		for(int i=65; i<=90;i++) {
//			System.out.println((char)i);
//		}
		
//		for (char ch ='A'; ch<='Z'; ch++) {
//			System.out.println(ch);
//		}
		
		char ch='D';
//		char ch2= (char)( ch+ 32);
		char ch2= (char)(ch + 'a'- 'A');
		System.out.println(ch2);
	}

}
