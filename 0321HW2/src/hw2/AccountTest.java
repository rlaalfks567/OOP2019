package hw2;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Miran", 5000);
		Account account2 = new Account("Mirae", 6000);
		
		System.out.printf("%s balance : %d won", account1.getName(), account1.getBalance());
		System.out.printf("%s balance : %d won", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		//System.out.printf();
	}
}
