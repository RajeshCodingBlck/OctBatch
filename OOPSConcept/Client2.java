package OOPSConcept;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1= new Student("Aman", "2K19/CSE/45", 67);
     Student s2= new Student("Rohit", "2K19/MC/120", 56);
     System.out.println( "Aman address " + s1);
     System.out.println( "Rohit address " + s2);
     s1.introduction();
     s2.introduction();
	}

}
