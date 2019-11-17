package day09;

public class CarTest {	// 추상화 활용 예시1 - 자동차
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "검은색";
		car1.name = "K5";
		car1.owner = "홍길동";
		car1.wheel = 4;
		car1.goForward();
		car1.backReverse();
		System.out.println();
		
		Car car2 = new Car();
		car2.color = "투명색";
		car2.name = "차없찐";
		car2.owner = "오경덕";
		car2.wheel = 0;
		car2.backReverse();
		car2.backReverse();
		car2.backReverse();
		System.out.println();
		
		Car car3 = new Car();
		car3.color = "노란색";
		car3.name = "범블비";
		car3.owner = "샘 윗위키";
		car3.wheel = 3000;
		car3.goForward();
		car3.backReverse();
		car3.goForward();
		car3.backReverse();
		System.out.println();
	}
}
