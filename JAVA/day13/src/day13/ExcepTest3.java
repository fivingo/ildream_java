package day13;
// ����ó�� 3
public class ExcepTest3 {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");

		for (int i = 1; i <= 5; i++) {
			try {
				int temp = 10 / (i - 3);
				System.out.println("temp = " + temp);
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� ����");
			}
		}

		System.out.println("���α׷��� ��");
	}
}
