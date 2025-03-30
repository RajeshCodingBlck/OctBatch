package TreeDemo;

import java.util.LinkedList;

public class Client {

	public static void preOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static int sumOfAllNodes(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		int leftSum= sumOfAllNodes(root.left);
		int rightSum= sumOfAllNodes(root.right);
		int meraAns= leftSum+ rightSum+ root.data;
	    return meraAns;	
	}
	
	public static void bfs(TreeNode root) {
		
		 LinkedList<TreeNode> q= new LinkedList();
		 q.add(root);
		 while(q.size()>0) {
			 // remove
			 TreeNode rm= q.removeFirst();
			 // work
			 System.out.print(rm.data+" ");
			 //add their Childrens
			 if(rm.left !=null) {
				 q.add(rm.left);
			 }
			 
			 if(rm.right !=null) {
				 q.add(rm.right);
			 }
		 }
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MyTree t= new MyTree();
//		preOrder(t.root);
//		System.out.println(sumOfAllNodes(t.root));
		bfs(t.root);
//		 1 2 3 -1 -1 4 -1 -1 3 -1 -1
	}

}
