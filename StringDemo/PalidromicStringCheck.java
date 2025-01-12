package StringDemo;

public class PalidromicStringCheck {

	public static String reverse(String str) {

		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		return ans;
	}

	public static boolean isPalidromic(String str) {

		String reverseString= reverse(str);
		
		if( reverseString.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPlaidromic2(String str) {
		
		int i=0;
		int j= str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i) !=str.charAt(j)) {
				 return false;
			}
			
			i++;
			j--;
		}
		
		return true;
		
	}
	
	public static void printAllSubstring(String str) {
		
		// Starting Cut
		for(int s=0; s<str.length(); s++) {
			for(int e=s; e<str.length(); e++) {
				System.out.println("cut is from ( "+ s +
						" , "+ e+ " ) ");
				System.out.println(str.substring(s, e+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abba";
		//System.out.print(isPalidromic(str));
		printAllSubstring(str);
	}

}
