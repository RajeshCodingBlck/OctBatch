package Encapsulation;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account obj= new Account();
      System.out.println(obj.balance);
      obj.balance=0;
      System.out.println(obj.balance);
	}

}
