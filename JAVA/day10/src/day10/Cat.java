package day10;
// overloading ����1
public class Cat {
	String name;
	int age;
	String kind;
	
	public Cat() {
		name = "����";
		age = 2;
		kind = "�ڸ��� ��";
	}
	public Cat(String name) {
		this.name = name;
		age = 2;
		kind = "�ڸ��� ��";
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		kind = "�ڸ��� ��";
	}
	public Cat(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
	public void getInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("ǰ��: " + kind);
	}
}
