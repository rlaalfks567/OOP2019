import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = {9, 20, 28, 18, 11};
		int arr2[] = {30, 1, 21, 17, 28};
		
//		String x = "korea is wonderful";
//		char c = x.charAt(3); //x�� 3�� �ε����� �ش��ϴ� ���ڿ��� �̾ƿͶ�.
//		System.out.println(c);
		
		String x = Integer.toBinaryString(5); //5�� ��������
		char c = x.charAt(1);  
		System.out.println(c);
		
		String z = Integer.toBinaryString(33);
		int len = z.length(); //���ڿ��� ����?
		System.out.println(len); 
	}
}