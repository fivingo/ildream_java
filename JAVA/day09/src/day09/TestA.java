package day09;

public class TestA {	// static(����) ���� ����
	static int count = 0;
	
	public TestA() {
		count += 1;
	}
	
	public static void getInfo() {
		System.out.println("������ ��ü " + count + "��");
	}
}
