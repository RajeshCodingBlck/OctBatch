package StringQuestions;

public class CheckWhetherisPalidromicUnsingRearrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="ababcb";
        int [] fre= new int [256];
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	int ascii= ch;
        	fre[ascii]++;
        }
        int count=0;// How Many character are there whose 
        // fre is Odd
        for(int i=0; i<fre.length;i++) {
        	if(fre[i]%2==1) {
        		count++;
        	}
        }
        if(count==0 || count==1) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
        
	}

}
