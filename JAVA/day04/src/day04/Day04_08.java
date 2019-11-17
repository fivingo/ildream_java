package day04;

import java.io.*;

public class Day04_08 {
	public static void main(String[] args) throws IOException {
		System.out.print("숫자 입력: ");
		int num = System.in.read() - 48;
		
		if (num % 2 == 0 && num != 0) {
			System.out.println("숫자 " + num + "는 짝수입니다.");
		} else if (num == 0) {
			System.out.println("그냥 " + num + "입니다. 짜샤");
 		} else {
 			System.out.println("숫자 " + num + "는 홀수입니다.");
 		}
	}
}
