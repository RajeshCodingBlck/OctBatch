package Encapsulation;

public class Account {

	private int balance=100;
	
	  String password="123";

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance, String userPassword) {
		
		if(userPassword==password) {
			this.balance = balance;
		}
	}
	
    

}
