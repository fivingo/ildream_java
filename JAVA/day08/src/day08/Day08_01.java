package day08;

public class Day08_01 {	// 메서드 기초예시1
	
	// call by name - 단순호출
	public static void xLine() {
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		System.out.println("이름: 홍길동");
		xLine();
		System.out.println("나이: 20살");
		xLine();
		System.out.println("주소: 서울");
		xLine();
	}
}
