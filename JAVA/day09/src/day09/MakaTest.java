package day09;

public class MakaTest {	// �߻�ȭ �⺻ Ȱ�� ����
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		
		Maka m1 = new Maka();	// ��ǻ� ������ ȣ��
		m1.color = "�Ķ�";
		m1.makaWrite();
		
		Maka m2 = new Maka();
		m2.color = "����";
		m2.makaWrite();
		
		Maka m3 = new Maka();
		m3.color = "���";
		m3.makaWrite();
		
		Maka m4 = new Maka();
		m4.makaWrite();
		
		System.out.println("���α׷��� ��");
	}
}
