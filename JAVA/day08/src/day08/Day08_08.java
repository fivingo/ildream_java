package day08;
/*
 * 숫자 야구 게임
 * 1. 중복되지않는 3개수 (1~9)
 * 2. 자리와 숫자가 같으면 - 스트라이크
 * 3. 자리는 다르고 숫자가 같으면 - 볼
 * 4. 기회는 10번 끝, 맞춰도 끝
 * 
 * 구상
 * 컴 난수발생3후 배열에 대입 -> 사용자 숫자3입력 -> [하나씩 비교] -> 결과출력
 */
import java.io.*;

public class Day08_08 {
	
	/** 컴퓨터 난수 3개 발생 후 배열에 대입 메서드 */
	public static void getComRandom(int com[]) {
		while(true) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
			}
			
			if (!(com[0] == com[1] || com[1] == com[2] || com[2] == com[0])) {
//				for (int i = 0; i < com.length; i++) {	// 컴난수 출력
//					System.out.print(com[i] + " ");
//				}
				break;
			}
		}
		System.out.println();
	}
	
	
	
	/** 사용자 숫자 3개 입력 메서드 */
	public static void getUserNumber(int user[]) throws IOException {
		for (int i = 0; i < user.length; i++) {
			System.out.print("숫자" + (i + 1) + "> ");
			user[i] = System.in.read() - 48;
			System.in.skip(2);
			
			while (user[i] == 0) {
				System.out.println("0 안됨 다시 입력하셈");
				System.out.print("숫자" + (i + 1) + "> ");
				user[i] = System.in.read() - 48;
				System.in.skip(2);
			} 
			
			while (i > 0 && user[i - 1] == user[i]) {
				System.out.println("중복 안됨 다시 입력하셈");
				System.out.print("숫자" + (i + 1) + "> ");
				user[i] = System.in.read() - 48;
				System.in.skip(2);
			}
		}
	}
	
	/** 두 배열값 비교 메서드 */
	public static void compare(int com[], int user[], int result[]) {
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j]) {
					if (i == j) {
						result[0] += 1;
					} else {
						result[1] += 1;
					}
				}
			}
		}
	}
	
	/** 결과 출력 메서드 */
	public static void getResult(int com[], int user[], int result[]) throws IOException {
		int op = 10;	// opportunity
		
		while (true) {
			getUserNumber(user);
			compare(com, user, result);
			
			System.out.println();
			System.out.print(op + ".");
			for (int i = 0; i < user.length; i++) {
				System.out.print(user[i] + " ");
			}
			System.out.println("[" + result[0] + "S " + result[1] + "B]");
			System.out.println();
			
			op -= 1;
			if (result[0] == 3) {
				System.out.println("굿 맞췄다. 게임오버");
				break;
			} else if (op == 0) {
				System.out.println("못 맞췄다. 게임오버");
				break;
			} else {
				result[0] = 0;
				result[1] = 0;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("=숫자 야구 게임=");
		System.out.println("숫자 3개 맞춰봐라 짜샤");
		System.out.println();
		
		int com[] = new int[3];
		int user[] = new int[3];
		int result[] = new int[2];
		
		getComRandom(com);
		getResult(com, user, result);
	}
}
