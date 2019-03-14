import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("입력: ");
		x = sc.nextInt();
		
		if (x == 0) {
			System.out.println("0입니다.");
		} else {
			if ((x & (1 << 31)) == 0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("음수입니다.");
			}
		}
		
		
	}
}
