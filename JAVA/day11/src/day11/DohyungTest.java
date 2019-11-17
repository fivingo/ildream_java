package day11;
// �߻� Ŭ���� ����1

// PM - �� ������ ���̸� ���ϴ� ���α׷��� �ۼ�
abstract class Dohyung {	// �߻� Ŭ����
	int version = 1;
	
	// ���̸� ���ϴ� ����� �޼���
	abstract public void area(int i, int j);
	
	public void getInfo() {
		System.out.println("���� ����: v" + version);
	}
}

// �Ѹ� - �簢��
class Rect extends Dohyung {
	public void area(int i, int j) {
		int result = i * j;
		System.out.println("�簢���� ����: " + result);
	}
}

// ��ġ - �ﰢ��
class Triangle extends Dohyung {
	@Override	// ������̼�
	public void area(int i, int j) {
		int result = i * j / 2;
		System.out.println("�ﰢ���� ����: " + result);
	}
}

// ����� - ��
abstract class Circle extends Dohyung {
	abstract public void area(int i);
}

// ����� �λ�� - ��2
class Circle2 extends Circle {
	@Override
	public void area(int i) {
		double result = i * i * Math.PI;
		System.out.println("���� ����: " + result);
	}
	@Override
	public void area(int i, int j) {}	// ��� ���ص� �޼��� �������̵�
}

public class DohyungTest {
	public void goArea(int i, int j) {
		System.out.println("���� = " + i + " / ���� = " + j + " �� ������ ����");
		
		Rect r = new Rect();
		r.area(i, j);
		Triangle t = new Triangle();
		t.area(i, j);
		Circle c = new Circle2();
		c.area(j);
		
		//Dohyung d = new Dohyung();	// �߻�Ŭ������ ��ü����x
		Dohyung d1 = new Rect();		// �ڵ�Ÿ�Ժ�ȯ �� ��ü����o
		d1.area(5, 5);
		Dohyung d2 = new Triangle();
		d2.area(5, 5);
		d2.getInfo();	// �߻�Ŭ������ �޼��� ȣ�� ����
		Dohyung d3 = new Circle2();
		d3.area(5, 5);	// �޼���� �������̵��Ǿ� ����������, ��ɱ���x
		
		Circle d4 = (Circle) d3;	// ����Ÿ�Ժ�ȯ (d3�� DohyungŸ��)
		d4.area(5);		// Ÿ�Ժ�ȯ �� ���� �Ѱ�¥�� �������̵��� �޼��� ȣ�Ⱑ��
	}
	
	public static void main(String[] args) {
		DohyungTest dt = new DohyungTest();
		dt.goArea(10, 20);
	}
}
