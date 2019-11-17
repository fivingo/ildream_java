package day10;
// overloading 예시1
public class Cat {
	String name;
	int age;
	String kind;
	
	public Cat() {
		name = "나비";
		age = 2;
		kind = "코리안 숏";
	}
	public Cat(String name) {
		this.name = name;
		age = 2;
		kind = "코리안 숏";
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		kind = "코리안 숏";
	}
	public Cat(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
	public void getInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("품종: " + kind);
	}
}
