package day13;
// ����ó�� 2
public class ExcepTest2 {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		
		try {
			String fruit[] = {"���", "��", "����", "����"};
		
			for (int i = 0; i <= 4; i++) {
				System.out.println(fruit[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �߸��� �ε����� ������");
		}
		
		System.out.println("���α׷��� ��");
	}
}
