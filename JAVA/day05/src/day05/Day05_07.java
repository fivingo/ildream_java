package day05;

import java.io.*;

public class Day05_07 {
	public static void main(String[] args) throws IOException {
		System.out.print("구구단 입력: ");
		int num = System.in.read() - 48;
		
		for (int i = 1; i <= 9; i++) {
			int res = 0;
			res = num * i;
			System.out.println(num + " * " + i + " = " + res);
		}
	}
}
