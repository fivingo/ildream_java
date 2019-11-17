package day09;

public class TestA {	// static(정적) 변수 예시
	static int count = 0;
	
	public TestA() {
		count += 1;
	}
	
	public static void getInfo() {
		System.out.println("생성된 객체 " + count + "개");
	}
}
