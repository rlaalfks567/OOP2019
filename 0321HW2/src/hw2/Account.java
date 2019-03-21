package hw2;
//p55부터 Account
public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;	
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	//deposit amount = 예치 금액
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > balance) {
			System.out.print("잔고를 초과하여 인출하려한다 너");
		}//0보다 작을때 balance 보다 클 때 작을때 하기.
	}
}
