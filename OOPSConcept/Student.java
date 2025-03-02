package OOPSConcept;

public class Student {

	String name ="Rajesh";
	String rollNumber ="2K19/GFT/67";
	int marks=76;
	
	// constructor
	
	public Student(String name,String rollNumber, int marks) {
//		System.out.println( "this Store "+ this);
		this.name= name;
		this.rollNumber= rollNumber;
		this.marks=marks;
	}
	
	public Student() {
		name= "Aman";
		rollNumber= "2K19/CSE/12";
		marks=35;
	}
	void introduction(){
		System.out.println( "this Store in Introduction function"+ this);
		System.out.println(name+ " "+ 
	     rollNumber + " "+ marks);
	}
}
