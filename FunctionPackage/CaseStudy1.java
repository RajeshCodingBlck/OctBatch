package FunctionPackage;

public class CaseStudy1 {
  
//	// "static void main" must be defined in a public class.
//	public class Main {
//	    
//	    public static int demo1(){
//	        System.out.println("demo1 is run");
//	        int a=12;
//	        int b=13;
//	        int ans=a+b;
//	        return ans;
//	        return 12;
//	        //System.out.println("demo1 is End");
//	    }
//	    public static void main(String[] args) {
//	        System.out.println("Hello World!");
//	       demo1();
//	        System.out.println("End Bye Bye");
//	    }
//	}
	
//	Error : due to unreachable Statement at Line 15.
	
	
//	Case 2
//	public static int demo1(int a){
//        
//        if(a==12){
//            return 12;
//        }
//        System.out.println("Hello from Demo1");
//   }
//   public static void main(String[] args) {
//       System.out.println("Hello World!");
//       int ans= demo1(12);
//       System.out.println(ans);
//   }
	
//	 Java is Two phase System 
//	 1) Compilation phase
//     2) RunTime Phase
//     
//     Above code fail to pass Compilation Phase 
//     due to function defination. Here return Statement is missing if (if Statement) is not run.

//	 Case 3
//public static int demo1(int a){
//         
//         if(a==12){
//             return 12;
//         }
//         System.out.println("Hello from Demo1");
//        return 13;
//    }
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int ans= demo1(15);
//        System.out.println(ans);
//    }
	
//	 This is Example of Conditional return.
//			 if not run, then 
//			 System.out.println("Hello from Demo1"); 
//	 is reachable . 
//	 it Not Give Error of unrechable,
	 
}
