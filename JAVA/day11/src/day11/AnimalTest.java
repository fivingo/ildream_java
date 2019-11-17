package day11;
// 추상클래스 예시2
import java.io.*;

abstract class Animal {
	public abstract void getBaby(int i);
	public abstract void crySound();
}

class Dog extends Animal {
	@Override
	public void getBaby(int i) {
		System.out.println("강아지가 " + i + "마리가 태어났어요.");
	}
	@Override
	public void crySound() {
		System.out.println("강아지가 월월웡ㄹ우렁루하고 짖어요~");
	}
}

class Cat extends Animal {
	@Override
	public void getBaby(int i) {
		System.out.println("좆냥이가 " + i + "마리가 태어났어요.");
	}
	@Override
	public void crySound() {
		System.out.println("좆냥이가 우워우어엉하고 짜증나게 굴어요~");
	}
}

class Duck extends Animal {
	@Override
	public void getBaby(int i) {
		System.out.println("오리가 " + i + "마리가 태어났어요.");
	}
	@Override
	public void crySound() {
		System.out.println("오리가 꽥고객꽤ㅣ괙하고 울어요~");
	}
}

public class AnimalTest {
	public static void main(String[] args) throws IOException {
		
		int kindAnimal;
		int numberAnimal;
		
		System.out.println("1.강아지 2.좆냥이 3.오리");
		System.out.print("어떤 동물이 태어났나요? > ");
		kindAnimal = System.in.read() - 48;
		System.in.skip(2);
		System.out.print("몇마리가 태어났나요? > ");
		numberAnimal = System.in.read() - 48;
		System.in.skip(2);
		
		Animal ani = null;	// 다형성
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
				System.out.println("깝ㄴㄴ");
		}
	}
}
