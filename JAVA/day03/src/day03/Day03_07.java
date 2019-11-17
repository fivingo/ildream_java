package day03;

import java.io.*;

public class Day03_07 {
	public static void main(String[] args) throws IOException {
		int n1 = System.in.read() - 48; // read() 메소드로 입력시 ASCII코드로 입력되어 48을 빼준다
		System.in.skip(2);
		
		int n2 = System.in.read() - 48;
		System.in.skip(2);
		
		int sum = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}
}
