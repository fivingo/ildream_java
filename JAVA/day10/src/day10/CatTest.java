package day10;
// overloading ����1 Ȱ��
public class CatTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.getClass();
		System.out.println("==============");
		
		Cat cat2 = new Cat("�����");
		cat2.getInfo();
		System.out.println("==============");
		
		Cat cat3 = new Cat("������", 10);
		cat3.getInfo();
		System.out.println("==============");
		
		Cat cat4 = new Cat("���̷�", 1, "������");
		cat4.getInfo();
	}
}
