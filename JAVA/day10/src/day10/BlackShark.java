package day10;
// ��� ���� Ȱ��
public class BlackShark extends BaseCar {
	String skill;
	
	public BlackShark(String carName, int maxSpeed, String skill) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.skill = skill;
	}
	
	public void getInfo() {
		super.getInfo();	// ����Ŭ���� ��� ȣ��
		System.out.println("��ų: " + skill);
	}
}
