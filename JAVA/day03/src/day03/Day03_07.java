package day03;

import java.io.*;

public class Day03_07 {
	public static void main(String[] args) throws IOException {
		int n1 = System.in.read() - 48; // read() �޼ҵ�� �Է½� ASCII�ڵ�� �ԷµǾ� 48�� ���ش�
		System.in.skip(2);
		
		int n2 = System.in.read() - 48;
		System.in.skip(2);
		
		int sum = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}
}
