package day08;

public class Day08_02 {	// �޼��� ���ʿ���2
	
	// call by value - �Ű������� ������ ��������
	public static int getSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void valueTest(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a + " / b = " + b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a + " / b = " + b);
		valueTest(a, b);
		System.out.println("a = " + a + " / b = " + b);	// ������ ����x
		
		//int sum = getSum(a, b);
		//System.out.println("a + b = " + sum);
	}
}
