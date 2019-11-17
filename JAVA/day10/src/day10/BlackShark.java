package day10;
// 상속 기초 활용
public class BlackShark extends BaseCar {
	String skill;
	
	public BlackShark(String carName, int maxSpeed, String skill) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.skill = skill;
	}
	
	public void getInfo() {
		super.getInfo();	// 상위클래스 멤버 호출
		System.out.println("스킬: " + skill);
	}
}
