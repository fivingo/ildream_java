package day11;
// �߻�Ŭ���� ����2
import java.io.*;

abstract class Animal {
	public abstract void getBaby(int i);
	public abstract void crySound();
}

class Dog extends Animal {
	@Override
	public void getBaby(int i) {
		System.out.println("�������� " + i + "������ �¾���.");
	}
	@Override
	public void crySound() {
		System.out.println("�������� ���������췷���ϰ� ¢���~");
	}
}

class Cat extends Animal {
	@Override
	public void getBaby(int i) {
		System.out.println("�����̰� " + i + "������ �¾���.");
	}
	@Override
	public void crySound() {
		System.out.println("�����̰� ��������ϰ� ¥������ �����~");
	}
}

class Duck extends Animal {
	@Override
	public void getBaby(int i) {
		System.out.println("������ " + i + "������ �¾���.");
	}
	@Override
	public void crySound() {
		System.out.println("������ �а��ϤӂE�ϰ� ����~");
	}
}

public class AnimalTest {
	public static void main(String[] args) throws IOException {
		
		int kindAnimal;
		int numberAnimal;
		
		System.out.println("1.������ 2.������ 3.����");
		System.out.print("� ������ �¾����? > ");
		kindAnimal = System.in.read() - 48;
		System.in.skip(2);
		System.out.print("����� �¾����? > ");
		numberAnimal = System.in.read() - 48;
		System.in.skip(2);
		
		Animal ani = null;	// ������
		switch (kindAnimal) {
			case 1:
				ani = new Dog();
				ani.getBaby(numberAnimal);
				ani.crySound();
				break;
			case 2:
				ani = new Cat();
				ani.getBaby(numberAnimal);
				ani.crySound();
				break;
			case 3:
				ani = new Duck();
				ani.getBaby(numberAnimal);
				ani.crySound();
				break;
			default:
				System.out.println("������");
		}
	}
}
