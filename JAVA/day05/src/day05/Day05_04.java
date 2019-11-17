package day05;

import java.io.*;

public class Day05_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수 입력: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
			
		char grd = 0;
		switch (avg / 10) {	//그룹화 (갯수로 나눈다: /갯수)
		case 10:	//case 9와 같은 결과값이라 생략가능 (절차지향)
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
		System.out.println("등급: " + grd);
	}
}
