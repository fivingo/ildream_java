package day03;

public class Day03_04 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int max = num1 > num2 ? num1 : num2;	// ���׿����ڴ� ����� ��ȯ
		// ������ ? �� : ����;
		
		System.out.println(num1 + "�� " + num2 + "�� ū ���� " + max + "�Դϴ�");
		
		String str = num1 > num2 ? "num1" : "num2";
		
		System.out.println(str + "�� �� Ů�ϴ�");
		
	}
}
