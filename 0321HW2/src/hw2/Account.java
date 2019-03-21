package hw2;
//p55���� Account
public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;	
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	//deposit amount = ��ġ �ݾ�
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
			System.out.print("�ܰ� �ʰ��Ͽ� �����Ϸ��Ѵ� ��");
		}//0���� ������ balance ���� Ŭ �� ������ �ϱ�.
	}
}
