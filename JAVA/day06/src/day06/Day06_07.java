package day06;

import java.io.*;

public class Day06_07 {
	public static void main(String[] args) throws IOException {
		System.out.println("-----------------------");
		System.out.println("가위 바위 보 게임 v1.1");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("-----------------------");
		
		while (true) {
			
			// 사용자 입력
			System.out.print("메뉴> ");
			int user = (int) (System.in.read());
			System.in.skip(2);
			if (user == '4') {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else if (user < '1' || user > '4') {
				System.out.println("1~4 범위의 숫자를 입력하세요");
				System.out.println();
				continue;
			}
			//System.out.println("사용자: " + (char) user);	// 숫자로 출력
			switch (user) {
				case '1' :
					System.out.println("사용자: 가위");
					break;
				case '2' :
					System.out.println("사용자: 바위");
					break;
				case '3' :
					System.out.println("사용자: 보");
					break;
				default:
			}
			
			// 컴퓨터 난수 발생
			int com = (int) ((Math.random()) * 3 + 1);
			//System.out.println("컴퓨터: " + com);	// 숫자로 출력
			switch (com) {
				case 1 :
					System.out.println("컴퓨터: 가위");
					break;
				case 2 :
					System.out.println("컴퓨터: 바위");
					break;
				case 3 :
					System.out.println("컴퓨터: 보");
					break;
				default:
			}
			
			// 결과 출력
			if (user == '1' && com == 2 || user == '2' && com == 3
					|| user == '3' && com == 1) {
				System.out.println("사용자 패배!");
			} else if (user == '1' && com == 3 || user == '2' && com == 1
					|| user == '3' && com == 2) {
				System.out.println("사용자 승리!");
			} else {
				System.out.println("비겼습니다!");
			}
			System.out.println();
		}
	}
}
