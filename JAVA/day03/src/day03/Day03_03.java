package day03;

public class Day03_03 {
	public static void main(String[] args) {
		System.out.println("1. ���Կ����ڿ� ���������");
		
		int i;
		
		i = 10;
		System.out.println("i = " + i);
		i = i + 1;
		System.out.println("i = " + i);
		i += 1;
		System.out.println("i = " + i);
		i++;
		System.out.println("i = " + i);
		
		i = i - 1;
		i -= 1;
		i--;
		System.out.println("i = " + i);
		
		// i = i * 2;
		i *= 2;
		// i /= 3;	// ��
		i %= 3;		// ������
		System.out.println("i = " + i);
		
		System.out.println("\r2. ���׿�����");
		System.out.println("2_1. ��Ʈ Not ������");
		
		int m = 41;
		
		System.out.println("~m = " + ~m);
		// �������ڵ�� ��ȯ�ϰ� ���� -> (����ȭ)
		
		
		System.out.println("\r2_2. �� Not ������");
		
		boolean n = true;
		
		System.out.println("!n = " + !n);
		// System.out.println("!m = " + !m);	// ������ ����
		// ��Ʈ������(~)�� ��������(!)�� ����
		
		System.out.println("\r3. ��Ʈ ����Ʈ ������");
		
		/* 
		 * ����
		 * [ �� ������ �̵�Ƚ�� ] 
		 * 
		 * 1. <<
		 * 	���� ���ϴ� Ƚ����ŭ �������� �̵�
		 * 	�������� 0���� ä����
		 * 2. >>
		 * 	���� ���ϴ� Ƚ����ŭ ���������� �̵�
		 * 	�������� ��ȣȭ��Ʈ�� ä����
		 * 3. >>>
		 * 	���� ���ϴ� Ƚ����ŭ ���������� �̵�
		 * 	�������� ������ 0���� ä����
		 */
		int s = 6;	// ...0000 0110
		
		System.out.println("s = " + s);
		// System.out.println("s << 2 = " + s << 2);
		// ������ �켱������ ���� �����Ͽ���
		System.out.println("s << 2 = " + (s << 2));		// ...0001 1000
		System.out.println("s >> 2 = " + (s >> 2));		// ...0000 0001
		System.out.println("s >>> 2 = " + (s >>> 2));	// ...0000 0001
		
		int s2 = -6;	// ����ȭ: �������ڵ�� ��ȯ �ϰ� +1	// 1111...1111 1010
		
		System.out.println("s2 = " + s2);
		System.out.println("s2 << 2 = " + (s2 << 2));	// 1111...1110 1000
		System.out.println("s2 >> 2 = " + (s2 >> 2));	// 1111...1111 1110
		System.out.println("s2 >>> 2 = " + (s2 >>> 2));	// 0011...1111 1110
		
		System.out.println("\r4. ���迬����");
		
		System.out.println("7 > 3 = " + (7 > 3));
		System.out.println("7 < 3 = " + (7 < 3));
		System.out.println("7 == 3 = " + (7 == 3));
		System.out.println("7 != 3 = " + (7 != 3));
		
		System.out.println("\r5. ��Ʈ������");
		
		/* 
		 * & and ������ 
		 * 	�����Ǵ� ��Ʈ�� ���Ͽ� ��� 1�̸� 1�� ��ȯ
		 * 	�ϳ��� 0�̸� 0�� ��ȯ
		 * | or ������
		 * 	�����Ǵ� ��Ʈ�� ���Ͽ� �ϳ��� 1�̸� 1�� ��ȯ
		 * 	��� 0�̸� 0�� ��ȯ
		 * ^ xor ������
		 * 	�����Ǵ� ��Ʈ�� ���Ͽ� ���� �ٸ��� 1�� ��ȯ
		 * 	������ 0�� ��ȯ
		 */
		
		int a = 6;	// ...0000 0110
		int b = 11;	// ...0000 1011
		
		System.out.println("a = " + a + " / b = " + b);
		System.out.println("a & b = " + (a & b));	// ...0000 0010
		System.out.println("a | b = " + (a | b));	// ...0000 1111
		System.out.println("a ^ b = " + (a ^ b));	// ...0000 1101
		
		System.out.println("\r6. ��������");
		
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && false = " + (false && false));
		
		System.out.println("7 > 5 && 4 > 3 = " + (7 > 5 && 4 > 3));
		System.out.println("7 > 5 && 4 < 3 = " + (7 > 5 && 4 < 3));
		System.out.println("7 < 5 && 4 > 3 = " + (7 < 5 && 4 > 3));
		System.out.println("7 < 5 && 4 < 3 = " + (7 < 5 && 4 < 3));
		// ������ �켱������ ���� >, <�� &&���� ���� ���
		
		int n1 = 1;
		int n2 = n1++;
		// n1�� �켱������ ���� n2�� ���� �� 1�� ������ ���·� �ڵ�����
		// n1++ == n1 = n1 + 1
		// ������������(n1++)�� �켱���� ���� ������
		
		if ((n1 > ++n2) && (n1++ == n2)) {	// f && t	// ++n2�� �켱������ ���� ���� 1 ���� �� ��
			n1 += n2;
		}
		// �� ���迬���ڰ� false�� �� ���迬���ڴ� ó������ �ʴ´�. (��¥�� false)
		System.out.println("n1 = " + n1 + " / n2 = " + n2);
		
		int n3 = 1;
		int n4 = n3++;
		
		if ((n3 > ++n4) & (n3++ == n4)) {	// f && t
			n3 += n4;
		}
		// ��Ʈ�������̱� ������ ���� ���踦 ���ϱ����� ��� ó����. (n3++ ó��)
		System.out.println("n3 = " + n3 + " / n4 = " + n4);
	}
}
