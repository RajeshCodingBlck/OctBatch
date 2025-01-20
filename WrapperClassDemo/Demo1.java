package WrapperClassDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int a=5;
		 Integer a= new Integer(5);
		 
		 Integer a1=5;
		 System.out.println(a1);
		 
		 // AutoBoxing
		 int b=12;
//		 Integer c=b;
		 Integer c= Integer.valueOf(b);
		 System.out.println(c);
		 
		 // Unboxing
		// int d= c; // 
		 int d= c.intValue();
		 System.out.println(d);
		 
       
	}

}
