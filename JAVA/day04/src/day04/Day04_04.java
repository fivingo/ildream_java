package day04;

import java.io.*;
import java.text.*;

public class Day04_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어점수: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수: ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;		//정수와 정수의 연산이라 결과값도 정수 -> 실수 포함 필요
		DecimalFormat df = new DecimalFormat();	//DecimalFormat 클래스 호출
		df.applyLocalizedPattern("0.0#");		//서식 지정
		
		System.out.println("\n총점: " + sum + "점");
		System.out.println("평균: " + avg + "점");
		System.out.printf("평균: %.2f점\n", avg);		//printf 사용해서 소수점 둘째자리까지
		System.out.println("평균: " + df.format(avg) + "점");	//df.format 메소드 호출
	}
}
