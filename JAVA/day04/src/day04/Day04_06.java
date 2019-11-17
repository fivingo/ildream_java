package day04;

import java.io.*;

public class Day04_06 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 수: ");
		int num1 = System.in.read() - 48;
		System.in.skip(2);
		
		System.out.print("두번째 수: ");
		int num2 = System.in.read() - '0';
		
		//0으로 나누기 불가능(Exception: Infinity)
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			System.exit(0);	//0 정상종료, 이외는 비정상종료
		}
		
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}
