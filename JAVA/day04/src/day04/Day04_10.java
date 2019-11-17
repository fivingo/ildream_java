package day04;

import java.io.*;
import java.text.*;

public class Day04_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("네놈의 국어점수 입력: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("네놈의 영어점수 입력: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("네놈의 수학점수 입력: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("0.0#");
		
		System.out.println("\n네놈의 총점: " + sum);
		System.out.println("네놈의 평균: " + df.format(avg) + "");
		
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
		System.out.println("\n네놈은 '" + grd + "'등급입니다.");
	}
}
