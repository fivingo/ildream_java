package day03;

import java.io.*; // io ��Ű�� �̿�

public class Day03_06 {
	public static void main(String[] args) throws IOException { // ����ó��
		System.out.println("A");
		int a = System.in.read();
		// �Է½� ASCII�ڵ�� �Է½�
		// �ѱ��ڸ� �Էµ�
		System.out.println("C");
		System.out.println("a = " + a);
		
		System.out.println("ù��°: ");
		int c1 = System.in.read();
		System.out.println("�ι�°: ");
		int c2 = System.in.read();
		System.out.println("����°: ");
		int c3 = System.in.read();
		
		System.out.println("c1 = " + c1 + " c2 = " + c2 + " c3 = " + c3);
		// ����Ű�� /r(13)�� /n(10) �Էµ�
		
		// ����Ű�� /r/n �ѹ��� ����
		System.out.println("ù��°: ");
		int e1 = System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("�ι�°: ");
		int e2 = System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("����°: ");
		int e3 = System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("e1 = " + e1 + " e2 = " + e2 + " e3 = " + e3);
		
		// skip �޼ҵ� �̿� (/r/n 2������)
		System.out.println("ù��°: ");
		int s1 = System.in.read();
		System.in.skip(2);	
		System.out.println("�ι�°: ");
		int s2 = System.in.read();
		System.in.skip(2);
		System.out.println("����°: ");
		int s3 = System.in.read();
		System.in.skip(2);
		
		System.out.println("s1 = " + s1 + " s2 = " + s2 + " s3 = " + s3);
	}
}
