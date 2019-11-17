package day05;

import java.io.*;

public class Day05_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��������: ");
		String kor_s = br.readLine();
		int kor = Integer.parseInt(kor_s);
		
		System.out.print("��������: ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("��������: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		
		System.out.println("����: " + sum + "��");
		System.out.println("���: " + avg + "��");
		
		char level = 'F';	//�������� ����� ���������� �ʱ�ȭ
		
		if (avg >= 90) {
			level = 'A';
		} else if (avg >= 80) {
			level = 'B';
		} else if (avg >= 70) {
			level = 'C';
		} else if (avg >= 60) {
			level = 'D';
		} else {
			level = 'F';	//'F'�� �̹� �ʱ�ȭ������ ��������� �ٽ� �ʱ�ȭ
		}
		System.out.println("���: " + level);
	}
}
