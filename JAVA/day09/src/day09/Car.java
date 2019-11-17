package day09;

public class Car {	// 추상화 예시1 - 자동차
	String color;
	String name;
	String owner;
	int wheel;
	
	public Car() {
		color = "흰색";
		name = "아반떼";
		owner = "무명";
		wheel = 4;
	}
	
	public void goForward() {
		System.out.println(name + " 전진");
	}
	public void backReverse() {
		System.out.println(name + " 후진");
	}
	public void getInfo() {	// 필드값 확인용도 - 생성 습관화
		System.out.println(color);
		System.out.println(name);
		System.out.println(owner);
		System.out.println(wheel);
	}
}
