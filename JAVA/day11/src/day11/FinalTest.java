package day11;
// final 키워드
/**
 *	final + class: 상속 방지 (확장방지)
 *	final + method: 오버라이딩 방지
 */
class Super {
	final public static int A = 10;	// 상수
	
	public void test1() {
		System.out.println("test1() 메서드 수행됨");
	}
}

class Sub extends Super {
	int b = 20;
	
	public void test1() {
		// A = 30;	// 접근 불가 (값 변경 방지)
		System.out.println("a = " + A);
		System.out.println("test1() 재정의된 메서드 수행됨");
	}
	public void test2() {
		System.out.println("test2() 메서드 수행됨");
	}
}

public class FinalTest {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.test1();
	}
}
