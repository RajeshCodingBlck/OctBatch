package ArraysPart1;

public class CaseStudy1 {

	public static void swap(int a, int b) {
	
		int temp=a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=12;
		int b=13;
		System.out.println("Before Swap "+ a+ " , "+ b);
		swap(a,b);
		System.out.println("After Swap "+ a+ " , "+ b);
	}

}
