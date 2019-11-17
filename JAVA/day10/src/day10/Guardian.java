package day10;
// 상속 기초 활용
public class Guardian extends BaseCar {
	String item;
	
	public Guardian(String carName, int maxSpeed, String item) {
		//super();	// 기본적으로 상위클래스 생성자 호출
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.item = item;
	}
	
	public void getInfo() {
		super.getInfo();	// super: 상위클래스 멤버 호출
		System.out.println("아이템: " + item);
	}
	public void getInfo(String title) {	// 오버로딩
		System.out.println(title);
		this.getInfo();
	}
}
