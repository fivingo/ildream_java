package day13;
// 사용자정의 예외 (goto-label 대용: 코드 점프)
// goto-label 예약어 사용 금지 -> 논리 붕괴 가능성
import java.util.*;

/** Exception을 상속받는 새로운 임의클래스 생성 */
class YongException extends Exception {
	public YongException() {
		super("용예외: 미성년자 ㄴㄴ");	// 슈퍼클래스의 생성자 호출 (인자값 지정)
	}
}

public class UserExcepTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// br보다 편한 입력방식
		System.out.print("몇살?> ");
		
		int age = sc.nextInt();	// 자료형 자동설정 (next자료형)
		
		try {
			if (age < 20) {
				System.out.println("미성년자 ㄴㄴ");
				throw new YongException();	// 인위적 예외발생
			}
			System.out.println("성인 환영");	// 코드 점프
		} catch (YongException e) {
			System.out.println("공통수행부분");	// 예외발생시 처리되는 코드
			e.printStackTrace();	// (예외내용 출력)
		}
		// 반드시 수행해야하는 부분
		System.out.println("프로그램 종료");
	}
}
