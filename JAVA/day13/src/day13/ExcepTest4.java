package day13;
// ���� ����ó��
public class ExcepTest4 {
	public static void main(String[] args) {
		try {
			// agrs - ����� �μ���
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
			System.out.println("����� ���� �Է��ϼž� �մϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("�Է��ϴ� ���� �ݵ�� ���������մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ �����ٶ�");
		}
	}
}
