package day04;

import java.io.*;

public class Day04_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.in 1byte 체계
		//InputStreamReader 2byte 체계
		//BufferedReader 문자열 체계
		//1byte -> 문자열 업그레이드
		
		System.out.print("첫번째 수: ");	//println 사용시 입력되는 문자열에 엔터키 포함됨
		String num1_s = br.readLine();	//엔터가 입력되는 시점까지 데이터 입력됨
		int num1 = Integer.parseInt(num1_s);
		//rapper 클래스 중 Integer 클래스 호출
		//Integer 클래스에 parseInt 메소드 호출
		
		System.out.print("두번째 수: ");
		String num2_s = br.readLine();
		int num2 = Integer.parseInt(num2_s);
		
		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
	}
}
