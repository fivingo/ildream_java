package day03;

public class Day03_05 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		int age = 20;
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age + "��");
		// println�� �ڵ�����
		
		System.out.print("�̸�: " + name);
		System.out.print("����: " + age + "��");
		// print�� �ڵ�����ȵ�
		
		System.out.print("��\t��: " + name + "\n");
		System.out.print("��\r��: " + age + "��\n");
		// \n ����
		// \t 1�Ǹ�ŭ ���
		// \r ������ �̵�
		
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %d��\n", age);
	}
}
