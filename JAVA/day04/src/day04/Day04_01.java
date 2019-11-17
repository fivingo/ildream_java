package day04;

import java.io.*;

public class Day04_01 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 수: ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);
		
		System.out.print("두번째 수: ");
		int num2 = System.in.read() - '0';	//숫자 48대신 문자 '0'사용
		//System.in.skip(2);	//skip 메소드 굳이 사용할 필요없음
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
}
