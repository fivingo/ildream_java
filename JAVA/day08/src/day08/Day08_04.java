package day08;

import java.io.*;

public class Day08_04 { // 값 입력받고 출력메서드 호출
	public static void gugu(int user) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(user + " * " + i + " = " + (user * i));
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.print("단입력> ");
		gugu(System.in.read() - 48);
	}
}
