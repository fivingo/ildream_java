package day05;

import java.io.*;

public class Day05_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어점수: ");
		String kor_s = br.readLine();
		int kor = Integer.parseInt(kor_s);
		
		System.out.print("영어점수: ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학점수: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + avg + "점");
		
		char level = 'F';	//지역변수 선언시 관습적으로 초기화
		
		if (avg >= 90) {
			level = 'A';
		} else if (avg >= 80) {
			level = 'B';
		} else if (avg >= 70) {
			level = 'C';
		} else if (avg >= 60) {
			level = 'D';
		} else {
			level = 'F';	//'F'로 이미 초기화했지만 명시적으로 다시 초기화
		}
		System.out.println("등급: " + level);
	}
}
