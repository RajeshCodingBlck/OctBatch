package StringQuestions;

public class SortTheString {

	public static int [] getFreArray(String  str) {
		
		int [] fre=new int[256];
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			int ascii= ch;
			fre[ascii]++;
		}
		return fre;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="ababbde";
         int [] fre= getFreArray(str);
         String ans="";
         for(int i=0;i<fre.length;i++) {
        	 if(fre[i] !=0) {
        		 char ch= (char)(i);
        		 int count=fre[i];
        		 while(count>0) {
        			 ans+= ch;
        			 count--;
        		 }
        	 }
         }
         System.out.println(ans);
	}

}
