package day09;

public class Maka {	// 추상화 기본 (객체모델링)
	
	// 속성 - 멤버변수(필드)
	String color;
	
	// 생성자 - 멤버변수의 초기화
	public Maka() {
		color = "검정";
	}
	
	// 기능 - 멤버메서드
	public void makaWrite() {
		System.out.println(color + "색상으로 마카를 씁니다.");
	}
}
