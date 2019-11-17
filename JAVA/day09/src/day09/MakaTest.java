package day09;

public class MakaTest {	// 추상화 기본 활용 예시
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		Maka m1 = new Maka();	// 사실상 생성자 호출
		m1.color = "파랑";
		m1.makaWrite();
		
		Maka m2 = new Maka();
		m2.color = "빨강";
		m2.makaWrite();
		
		Maka m3 = new Maka();
		m3.color = "노랑";
		m3.makaWrite();
		
		Maka m4 = new Maka();
		m4.makaWrite();
		
		System.out.println("프로그램의 끝");
	}
}
