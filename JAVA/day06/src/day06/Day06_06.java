package day06;

import java.io.*;

public class Day06_06 {
	public static void main(String[] args) throws IOException {
		System.out.println("-----------------------");
		System.out.println("가위 바위 보 게임 v1.1");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("-----------------------");
		
		while (true) {
			
			// 사용자 입력
			System.out.print("메뉴> ");
			int user = (int) (System.in.read()) - 48;
			System.in.skip(2);
			if (user == 4) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				//break; // 반복문 종료
			} else if (user < 1 || user > 4) {	// 유효성검사
				System.out.println("1~4 범위의 숫자를 입력하세요.");
				System.out.println();
				continue;
			}
			/* 유효성검사2
			int user = 0;			// do~while문 밖에 변수선언과 초기화
			do {
				if (user != 0) {	// 일단 어떤값이든 입력됐기에 (0은 아님)
					System.out.println("다시 입력하세요");
				}
				System.out.print("메뉴> ");
				user = (int) (System.in.read()) - 48;
				System.in.skip(2);
			} while (!(user >= 1 && user <= 4));		// 부정
			*/
			//System.out.println("사용자: " + (char) user);	// 숫자로 출력
			switch (user) {
				case 1:
					System.out.println("사용자: 가위");
					break;
				case 2:
					System.out.println("사용자: 바위");
					break;
				case 3:
					System.out.println("사용자: 보");
					break;
				default:
			}
			
			// 컴퓨터 난수 발생
			int com = (int) ((Math.random()) * 3 + 1);	
			// Math.random() 메소드는 double 타입 반환
			//System.out.println("컴퓨터: " + com);	// 숫자로 출력
			switch (com) {
				case 1:
					System.out.println("컴퓨터: 가위");
					break;
				case 2:
					System.out.println("컴퓨터: 바위");
					break;
				case 3:
					System.out.println("컴퓨터: 보");
					break;
				default:
			}
			System.out.println();
			
			/* 비즈니스 로직영역 */
			// 결과값 출력	// 경우의 수 7가지
			if (user == 1 && com == 2 || user == 2 && com == 3
					|| user == 3 && com == 1) {
				System.out.println("## 컴퓨터 승리! ##");
			} else if (user == 1 && com == 3 || user == 2 && com == 1
					|| user == 3 && com == 2) {
				System.out.println("## 사용자 승리! ##");
			} else {
				System.out.println("## 비겼습니다. ##");
			}
			
			// 결과값 출력2 // 적은수의 경우의 수 제시됐을때 switch활용	// 경우의 수 5가지
			switch (user - com) {
				case -2:
				case 1:
					System.out.println("## 사용자 승리! ##");
					break;
				case 2:
				case -1:
					System.out.println("## 컴퓨터 승리! ##");
					break;
				case 0:
					System.out.println("## 비겼습니다. ##");
					break;
				default:
			}
			
			// 결과값 출력3 // 진수코드 이용 (나머지 값)	// 경우의 수 3가지 (3진수)
			if (user == com) {
				System.out.println("## 비겼습니다. ##");
			} else if ((user + 1) % 3 == com % 3) {
				System.out.println("## 컴퓨터 승리! ##");
			} else {
				System.out.println("## 사용자 승리! ##");
			}
			System.out.println();
		}
	}
}
