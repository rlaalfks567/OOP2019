import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("�Է�: ");
		x = sc.nextInt();
		
		if (x == 0) {
			System.out.println("0�Դϴ�.");
		} else {
			if ((x & (1 << 31)) == 0) {
				System.out.println("����Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
			}
		}
		
		
	}
}
