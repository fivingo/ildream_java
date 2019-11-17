package day09;

public class TestATest {	// static(정적) 변수 활용 예시
	public static void main(String[] args) {
		TestA a = new TestA();
		TestA b = new TestA();
		TestA c = new TestA();
		TestA d = new TestA();
		
		TestA.getInfo();
	}
}
