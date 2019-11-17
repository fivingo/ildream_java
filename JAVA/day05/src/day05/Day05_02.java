package day05;

import java.io.*;

public class Day05_02 {
	public static void main(String[] args) throws IOException {
		System.out.print("문자 하나 입력: ");
		char letter = (char) (System.in.read());
		
		String result = null;
		//if (letter >= 65 && letter <= 122) {	//91~95 비영문자
		if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
			result = "영문자";
		} else if (letter >= 48 && letter <= 57) {
			result = "숫자";
		} else {
			result = "기타문자";
		}
		System.out.println("입력한 " + letter + "는 " + result + "입니다.");
	}
}
