package day10;
// ��� ���� Ȱ��
public class CarTest {
	public static void main(String[] args) {
		BaseCar car1 = new BaseCar();
		car1.carName = "����īƮ";
		car1.maxSpeed = 160;
		car1.getInfo();
		System.out.println("================");
		
		Guardian car2 = new Guardian("�����", 200, "Ȳ�ݾ�����");
		car2.getInfo("���� �ڵ���");
		System.out.println("================");
		
		BlackShark car3 = new BlackShark("����", 3000, "����ź���");
		car3.getInfo();
	}
}
