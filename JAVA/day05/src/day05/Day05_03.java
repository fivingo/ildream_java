package day05;

import java.io.*;

public class Day05_03 {
	public static void main(String[] args) throws IOException {
		System.out.println("1.짜장면 2.짬뽕 3.탕수육 4.팔보채");
		System.out.print("메뉴: ");
		int menu = System.in.read() - 48;
		
		switch (menu) {	//주어진 값으로 점프
		case 1:
			System.out.println("짜장면 선택됨! 조리바람!");
			break;	//프로그램을 강제로 종료시키는 보조제어문
		case 2:
			System.out.println("짬뽕 선택됨! 조리바람!");
			break;
		case 3:
			System.out.println("탕수육 선택됨! 조리바람!");
			break;
		case 4:
			System.out.println("팔보채 선택됨! 조리바람!");
			break;
		default:
			System.out.println("잘못된 메뉴입니다!");
		}
	}
}
