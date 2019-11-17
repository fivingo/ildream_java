package day04;

import java.io.*;
import java.text.*;

public class Day04_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�׳��� �������� �Է�: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("�׳��� �������� �Է�: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("�׳��� �������� �Է�: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("0.0#");
		
		System.out.println("\n�׳��� ����: " + sum);
		System.out.println("�׳��� ���: " + df.format(avg) + "");
		
		char grd;
		
		if (avg >= 90) {
			grd = 'A';
		} else if (avg < 90 && avg >= 80) {
			grd = 'B';
		} else if (avg < 80 && avg >= 70) {
			grd = 'C';
		} else if (avg < 70 && avg >= 60){
			grd = 'D';
		} else {
			grd = 'F';
		}
		System.out.println("\n�׳��� '" + grd + "'����Դϴ�.");
	}
}
