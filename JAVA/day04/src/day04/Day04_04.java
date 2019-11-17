package day04;

import java.io.*;
import java.text.*;

public class Day04_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��������: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("��������: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("��������: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;		//������ ������ �����̶� ������� ���� -> �Ǽ� ���� �ʿ�
		DecimalFormat df = new DecimalFormat();	//DecimalFormat Ŭ���� ȣ��
		df.applyLocalizedPattern("0.0#");		//���� ����
		
		System.out.println("\n����: " + sum + "��");
		System.out.println("���: " + avg + "��");
		System.out.printf("���: %.2f��\n", avg);		//printf ����ؼ� �Ҽ��� ��°�ڸ�����
		System.out.println("���: " + df.format(avg) + "��");	//df.format �޼ҵ� ȣ��
	}
}
