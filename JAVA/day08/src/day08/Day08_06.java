package day08;

import java.io.*;

public class Day08_06 {	// 메서드 생성과 호출 - 가위바위보 게임
	
	/** 메뉴 출력 메서드 */
	public static void printMenu() {
		System.out.println("-----------------------");
		System.out.println("가위 바위 보 게임 v1.1");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("-----------------------");
	}
	
	/** 사용자 입력 메서드 */
	public static int getUserValue() throws IOException {
		int user = 0;
		do {
			if (user != 0) {
				System.out.println("다시 입력하세요");
			}
			System.out.print("메뉴> ");
			user = (int) (System.in.read()) - 48;
			System.in.skip(2);
			if (user == 4) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		} while (!(user >= 1 && user <= 4));
		System.out.println("사용자: " + user);
		return user;
	}
	
	/** 컴퓨터 난수 발생 메서드 */
	public static int getComValue() {
		int com = (int) ((Math.random()) * 3 + 1);
		System.out.println("컴퓨터: " + com);
		return com;
	}
	
	/** 결과값 출력 메서드 */
	public static void getResult(int user, int com) {
		if (user == com) {
			System.out.println("## 비겼습니다. ##");
		} else if ((user + 1) % 3 == com % 3) {
			System.out.println("## 컴퓨터 승리! ##");
		} else {
			System.out.println("## 사용자 승리! ##");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		printMenu();
		
		while (true) {
			int user = getUserValue();
			int com = getComValue();	
			getResult(user, com);
		}
	}
}
