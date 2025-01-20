package WrapperClassDemo;

public class CaseStudy {
    
	public static void update(Integer a) {
		a++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//	Case Study -1
//	  Integer a=13;
//	  System.out.println(a);
//	  update(a);
//	  System.out.println(a);
	  // No Update  reason Wrapper class are immutable.
	  
	  
//	Integer a= 12;
//	Integer b=12;
//	Integer c= 500;
//	Integer d= 500;
//	
//	if(a==b) {
//		System.out.println("Kya Me Same Hu");
//	}else {
//		System.out.println("kya Me Same nahi hu");
//	}
//	
//	if(c==d) {
//		System.out.println("Kya Me Same Hu");
//	}else {
//		System.out.println("kya Me Same nahi hu");
//	}
//	
//	Due to Integer Cache -> "Kya Me Same Hu"
//	                        "kya Me Same nahi hu"
		
Case -4
//		Integer a= new Integer(12);
//		Integer b=new Integer(12);
//		Integer c= 500;
//		Integer d= 500;
	//	
//		if(a==b) {
//			System.out.println("Kya Me Same Hu");
//		}else {
//			System.out.println("kya Me Same nahi hu");
//		}
	//	
//		if(c==d) {
//			System.out.println("Kya Me Same Hu");
//		}else {
//			System.out.println("kya Me Same nahi hu");
//		}
	
//       No Integer Cache is used due to new Keyword

	
	}

}
