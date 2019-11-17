package day06;

import java.io.*;

public class Day06_01 {
	public static void main(String[] args) throws IOException {
		while (true) {
			int user = 0;
			
			do {
				System.out.print("숫자입력(0 = 종료): ");
				user = System.in.read();
				System.in.skip(2);
			} while (!(user >= 48 && user <=57));
			
			if (user == '0') {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
			System.out.println("입력한 숫자는 " + (char) user + "입니다.");
		}
	}
}
