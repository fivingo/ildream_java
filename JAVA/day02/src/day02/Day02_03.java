package day02;

public class Day02_03 {

	public static void main(String[] args) {
			
		System.out.println("1. ������ �ڷ���");
		
		boolean bool1;
		bool1 = true;
		
		System.out.println("bool1 = " + bool1);
		
		boolean bool2 = false;
		
		System.out.println("bool2 = " + bool2);
		
		System.out.println("2. ������ �ڷ���");
		
		byte by = 127;
		
		by++; // ���������÷ο� �߻� (byte: -128 ~ 127)
		System.out.println("by = " + by);
		
		char ch = 'A' + 1; // ����A �ƽ�Ű�ڵ�� ����
		
		System.out.println("ch = " + ch);
		// System.out.println("ch = " + (ch + 1));
		// (ch + 1)�� int�� �ڵ�����ȯ
		System.out.println("ch = " + (char)(ch + 1)); // ��������ȯ
		
		short sh = 1004;
		
		System.out.println("sh = " + sh);
		
		int in = 10004; // ������ �⺻ �ڷ���
		
		System.out.println("in = " + in);
		
		byte b1 = 3;
		byte b2 = 4;
		
		int result = b1 + b2;
		// byte result = b1 + b2; : int�� Ÿ�� �ڵ�����
		// byte result = (byte)(b1 + b2); : ��������ȯ
		
		System.out.println("result = " + result);
		
		long lo = 1234L;
		// ������ �⺻�ڷ��� int�� �ڵ������Ǳ⿡ ���̾� L ����
		
		System.out.println("lo = " + lo);
		
		System.out.println("3. �Ǽ��� �ڷ���");
		
		float fl = 3.14F;
		// �Ǽ��� �⺻�ڷ��� double�� �ڵ������Ǳ⿡ ���̾� F ����
		
		System.out.println("fl = " + fl);
		
		double dou = 3.14;
		
		System.out.println("dou = " + dou);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}