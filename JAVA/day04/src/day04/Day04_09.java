package day04;

import java.io.*;

public class Day04_09 {
	public static void main(String[] args) throws IOException {
		System.out.println("1.짜장면 2.짬뽕 3.탕수육 4.팔보채");
		System.out.print("메뉴: ");
		int menu = System.in.read() - 48;
		
		if (menu == 1) {
			System.out.println("짜장면 시켰음 조리바람!!");
		} else if (menu == 2) {
			System.out.println("짬뽕 시켰음 조리바람!!");
		} else if (menu == 3) {
			System.out.println("탕수육 시켰음 조리바람!!");
		} else {
			System.out.println("팔보채 시켰음 조리바람!!");
		}
	}
}
