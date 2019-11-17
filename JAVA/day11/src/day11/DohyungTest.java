package day11;
// 추상 클래스 예시1

// PM - 각 도형의 넓이를 구하는 프로그램을 작성
abstract class Dohyung {	// 추상 클래스
	int version = 1;
	
	// 넓이를 구하는 기능의 메서드
	abstract public void area(int i, int j);
	
	public void getInfo() {
		System.out.println("현재 버전: v" + version);
	}
}

// 둘리 - 사각형
class Rect extends Dohyung {
	public void area(int i, int j) {
		int result = i * j;
		System.out.println("사각형의 넓이: " + result);
	}
}

// 또치 - 삼각형
class Triangle extends Dohyung {
	@Override	// 어노테이션
	public void area(int i, int j) {
		int result = i * j / 2;
		System.out.println("삼각형의 넓이: " + result);
	}
}

// 도우너 - 원
abstract class Circle extends Dohyung {
	abstract public void area(int i);
}

// 도우너 부사수 - 원2
class Circle2 extends Circle {
	@Override
	public void area(int i) {
		double result = i * i * Math.PI;
		System.out.println("원의 넓이: " + result);
	}
	@Override
	public void area(int i, int j) {}	// 사용 안해도 메서드 오버라이딩
}

public class DohyungTest {
	public void goArea(int i, int j) {
		System.out.println("가로 = " + i + " / 세로 = " + j + " 인 도형의 넓이");
		
		Rect r = new Rect();
		r.area(i, j);
		Triangle t = new Triangle();
		t.area(i, j);
		Circle c = new Circle2();
		c.area(j);
		
		//Dohyung d = new Dohyung();	// 추상클래스는 객체생성x
		Dohyung d1 = new Rect();		// 자동타입변환 후 객체생성o
		d1.area(5, 5);
		Dohyung d2 = new Triangle();
		d2.area(5, 5);
		d2.getInfo();	// 추상클래스의 메서드 호출 가능
		Dohyung d3 = new Circle2();
		d3.area(5, 5);	// 메서드는 오버라이딩되어 생성됐지만, 기능구현x
		
		Circle d4 = (Circle) d3;	// 강제타입변환 (d3가 Dohyung타입)
		d4.area(5);		// 타입변환 후 인자 한개짜리 오버라이딩된 메서드 호출가능
	}
	
	public static void main(String[] args) {
		DohyungTest dt = new DohyungTest();
		dt.goArea(10, 20);
	}
}
