package TreeDemo;

import java.util.Scanner;

public class MyTree {
    
	TreeNode root=null;
	Scanner s= new Scanner(System.in);
	MyTree(){
		root= build();
	}

	private TreeNode build() {
		
		
		System.out.println("Enter the data");
		int data= s.nextInt();
		
		if(data==-1) {
			return null;
		}
	    TreeNode myroot= new TreeNode(data);
	    
	    System.out.println("Enter the Left Data "+ data);
	    myroot.left=build();
	    
	    System.out.println("Enter the Right Data "+ data);
	    myroot.right=build();
	    
	    return myroot;
	}
	
	
}
