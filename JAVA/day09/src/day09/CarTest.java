package day09;

public class CarTest {	// �߻�ȭ Ȱ�� ����1 - �ڵ���
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "������";
		car1.name = "K5";
		car1.owner = "ȫ�浿";
		car1.wheel = 4;
		car1.goForward();
		car1.backReverse();
		System.out.println();
		
		Car car2 = new Car();
		car2.color = "�����";
		car2.name = "������";
		car2.owner = "�����";
		car2.wheel = 0;
		car2.backReverse();
		car2.backReverse();
		car2.backReverse();
		System.out.println();
		
		Car car3 = new Car();
		car3.color = "�����";
		car3.name = "�����";
		car3.owner = "�� ����Ű";
		car3.wheel = 3000;
		car3.goForward();
		car3.backReverse();
		car3.goForward();
		car3.backReverse();
		System.out.println();
	}
}
