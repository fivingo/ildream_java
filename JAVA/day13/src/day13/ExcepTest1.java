package day13;
// 예외처리 1
public class ExcepTest1 {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		try {
			String str = null;
			
			// (모든 객체는 자동으로 toString() 호출)
			System.out.println("str = " + str.toString());
		} catch(NullPointerException e) {
			System.out.println("str이 비어있습니다.");
			e.printStackTrace();	// 예외에대한 정보출력
		}
		
		System.out.println("프로그램의 끝");
	}
}
