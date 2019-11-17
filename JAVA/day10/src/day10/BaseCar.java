package day10;
// 상속 기초
public class BaseCar {
	String carName;
	int maxSpeed;
	
	public BaseCar() {
	}
	
	public void getInfo() {
		System.out.println("카트이름: " + carName); 
		System.out.println("최고속도: " + maxSpeed);
	}
}
