package OOPSConcept;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AC Haier= new AC();
//		System.out.println(Haier.temp);
//		System.out.println(Haier.fanSpeed);
////		Haier.incTemp();
//		System.out.println(Haier.temp);
//		
//		AC Voltas= new AC();
//		System.out.println(Voltas.temp);
		
	  // ......................................
	  Student s1= new Student("Aman", "2k19/CSE/25", 56); // Student() constructorCall
	   System.out.println("\n.................");
	  s1.introduction();
	  System.out.println("s1 Address "+ s1);
//	  s1.name= "Aman";
//	  s1.rollNumber= "2K18/CSE/12";
//	  s1.marks=30;
//	  s1.introduction();
	  
	  System.out.println("\n.................");
	  Student s2= new Student("Ajit", "2k19/CSE/24", 80);
	  s2.introduction();
	  System.out.println("s2 Address "+ s2);
//	  s2.name= "Ajit";
//	  s2.rollNumber= "2K18/CSE/120";
//	  s2.marks=50;
//	  s2.introduction();
	  
	}

}
