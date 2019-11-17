package day11;
// final Ű����
/**
 *	final + class: ��� ���� (Ȯ�����)
 *	final + method: �������̵� ����
 */
class Super {
	final public static int A = 10;	// ���
	
	public void test1() {
		System.out.println("test1() �޼��� �����");
	}
}

class Sub extends Super {
	int b = 20;
	
	public void test1() {
		// A = 30;	// ���� �Ұ� (�� ���� ����)
		System.out.println("a = " + A);
		System.out.println("test1() �����ǵ� �޼��� �����");
	}
	public void test2() {
		System.out.println("test2() �޼��� �����");
	}
}

public class FinalTest {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.test1();
	}
}
