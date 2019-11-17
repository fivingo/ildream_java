package day04;

import java.io.*;

public class Day04_07 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 수: ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);
		
		System.out.print("두번째 수: ");
		int num2 = System.in.read() - '0';
		
		if (num1 > num2) {
			System.out.println("num1이 크고 그 값은 " + num1 + "입니다.");
		} else {
			System.out.println("num2가 크고 그 값은 " + num2 + "입니다.");
		}
	}
}
