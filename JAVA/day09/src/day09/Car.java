package day09;

public class Car {	// �߻�ȭ ����1 - �ڵ���
	String color;
	String name;
	String owner;
	int wheel;
	
	public Car() {
		color = "���";
		name = "�ƹݶ�";
		owner = "����";
		wheel = 4;
	}
	
	public void goForward() {
		System.out.println(name + " ����");
	}
	public void backReverse() {
		System.out.println(name + " ����");
	}
	public void getInfo() {	// �ʵ尪 Ȯ�ο뵵 - ���� ����ȭ
		System.out.println(color);
		System.out.println(name);
		System.out.println(owner);
		System.out.println(wheel);
	}
}
