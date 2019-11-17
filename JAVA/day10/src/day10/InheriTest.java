package day10;
// ��Ӱ� Ÿ�� ��ȯ ����
class Super {	// ����(����)Ŭ����
	int a;
	double b;
	
	public Super() {
		a = 10;
		b = 20.0;
	}
	
	public void test1() {
		System.out.println("test1() �޼��� �����");
	}
}

class Sub extends Super {	// ����(����)Ŭ����
	int a;
	int c;
	
	public Sub() {
		a = 100;
		c = 30;
	}
	
	public void test1() {	// �������̵�
		System.out.println("�������̵��� test1() �޼��� �����");
		System.out.println("c = " + c);
	}
	
	public void test2() {
		System.out.println("test2() �޼��� �����");
	}
}

public class InheriTest {
	public static void main(String[] args) {
		Super sp = new Super();
		System.out.println("sp.a = " + sp.a);
		System.out.println("sp.b = " + sp.b);
		sp.test1();
		System.out.println("------------------------");
		
		Super arr[] = new Super[3];	// ��ü �迭
		// arr�� ��ü�� ���۷����� ��� ���� �ϻ�, �⺻ null�� �ʱ�ȭ
		arr[0] = new Super();
		arr[1] = new Super();
		arr[2] = new Super();
		arr[1].test1();	// �� �迭�� ��ü �����ؾ� Ŭ�������ȣ�Ⱑ��
		System.out.println("------------------------");
		
		Sub sb = new Sub();
		sb.test2();
		sb.test1();	// �������̵��� �޼���
		System.out.println("sb.c = " + sb.c);
		System.out.println("sb.b = " + sb.b);	// ����Ŭ�������� ���� b��� ���� (���)
		System.out.println("sb.a = " + sb.a);	// ����Ŭ�������� �ٽ� �ʱ�ȭ��ä�� ���
		System.out.println("=========================");
		
		/* Ÿ�� ��ȯ */
		// �ڵ� Ÿ�� ��ȯ (promotion) �ڽ� Ÿ�� -> �θ� Ÿ��
		Super sp2 = new Sub();	// �ڽ� Ÿ�� ��ü ���� ����
		System.out.println("sp2.a = " + sp2.a);	// ����Ŭ������ �ʵ� ȣ��1
		System.out.println("sp2.b = " + sp2.b);	// ����Ŭ������ �ʵ� ȣ��2
		//System.out.println("sp.c = " + sp.c);	// ����Ŭ������ ��� ȣ�� �Ұ���1
		//sp.test2();	// ����Ŭ������ ��� ȣ�� �Ұ���2
		sp2.test1();	// '�������̵�'�� ����Ŭ������ �޼��尡 ȣ���
		// -> �޼���� ��ü�� �����Ǵ� heap������ �ƴ϶� static������ ����
		System.out.println("------------------------");
		
		Super arr2[] = new Super[3];
		arr2[0] = new Sub();	// �޼��� �������̵�o
		arr2[1] = new Super();	// �޼��� �������̵�x
		arr2[2] = new Sub();	// �޼��� �������̵�o
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i].test1();
		}
		System.out.println("------------------------");
		
		// ���� Ÿ�� ��ȯ (Casting) �θ� Ÿ�� -> �ڽ� Ÿ��
		Sub sb2 = (Sub) sp2;
		System.out.println("sb2.c = " + sb2.c);	// ����Ŭ������ ��� ȣ�� ����1
		sb2.test2();							// ����Ŭ������ ��� ȣ�� ����2
	}
}
