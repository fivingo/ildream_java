package day10;
// 상속 기초 활용
public class CarTest {
	public static void main(String[] args) {
		BaseCar car1 = new BaseCar();
		car1.carName = "연습카트";
		car1.maxSpeed = 160;
		car1.getInfo();
		System.out.println("================");
		
		Guardian car2 = new Guardian("가디언", 200, "황금아이템");
		car2.getInfo("나의 자동차");
		System.out.println("================");
		
		BlackShark car3 = new BlackShark("블랙샼", 3000, "물폭탄방어");
		car3.getInfo();
	}
}
