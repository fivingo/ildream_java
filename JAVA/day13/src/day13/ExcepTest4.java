package day13;
// 다중 예외처리
public class ExcepTest4 {
	public static void main(String[] args) {
		try {
			// agrs - 명령줄 인수값
			// Run - Run Configurations - Arguments - Program Arguments
			String str1 = args[0];
			String str2 = args[1];

			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);

			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			System.out.println("num1 = " + str1);
			System.out.println("num2 = " + str2);
			System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 값을 입력하셔야 합니다.");
		} catch (NumberFormatException e) {
			System.out.println("입력하는 값은 반드시 정수여야합니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("고객센터 연락바람");
		}
	}
}
