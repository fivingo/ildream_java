package day04;

import java.io.*;

public class Day04_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("당신의 이름은: ");
		String name = br.readLine();
		System.out.println("아하~ 이름이 " + name + "이군요!");
	}
}
