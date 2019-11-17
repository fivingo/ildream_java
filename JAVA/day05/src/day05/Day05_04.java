package day05;

import java.io.*;

public class Day05_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� ���� �Է�: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է�: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է�: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
			
		char grd = 0;
		switch (avg / 10) {	//�׷�ȭ (������ ������: /����)
		case 10:	//case 9�� ���� ������̶� �������� (��������)
		case 9: 
			grd = 'A';
			break;
		case 8: 
			grd = 'B';
			break;
		case 7: 
			grd = 'C';
			break;
		case 6: 
			grd = 'D';
			break;
		default: 
			grd = 'F';
		}
		System.out.println("���: " + grd);
	}
}
