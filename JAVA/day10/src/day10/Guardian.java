package day10;
// ��� ���� Ȱ��
public class Guardian extends BaseCar {
	String item;
	
	public Guardian(String carName, int maxSpeed, String item) {
		//super();	// �⺻������ ����Ŭ���� ������ ȣ��
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.item = item;
	}
	
	public void getInfo() {
		super.getInfo();	// super: ����Ŭ���� ��� ȣ��
		System.out.println("������: " + item);
	}
	public void getInfo(String title) {	// �����ε�
		System.out.println(title);
		this.getInfo();
	}
}
