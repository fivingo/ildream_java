package day13;
// 예외처리 2
public class ExcepTest2 {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		try {
			String fruit[] = {"사과", "배", "포도", "딸기"};
		
			for (int i = 0; i <= 4; i++) {
				System.out.println(fruit[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 잘못된 인덱스를 참조함");
		}
		
		System.out.println("프로그램의 끝");
	}
}
