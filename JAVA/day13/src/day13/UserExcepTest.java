package day13;
// ��������� ���� (goto-label ���: �ڵ� ����)
// goto-label ����� ��� ���� -> �� �ر� ���ɼ�
import java.util.*;

/** Exception�� ��ӹ޴� ���ο� ����Ŭ���� ���� */
class YongException extends Exception {
	public YongException() {
		super("�뿹��: �̼����� ����");	// ����Ŭ������ ������ ȣ�� (���ڰ� ����)
	}
}

public class UserExcepTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// br���� ���� �Է¹��
		System.out.print("���?> ");
		
		int age = sc.nextInt();	// �ڷ��� �ڵ����� (next�ڷ���)
		
		try {
			if (age < 20) {
				System.out.println("�̼����� ����");
				throw new YongException();	// ������ ���ܹ߻�
			}
			System.out.println("���� ȯ��");	// �ڵ� ����
		} catch (YongException e) {
			System.out.println("�������κ�");	// ���ܹ߻��� ó���Ǵ� �ڵ�
			e.printStackTrace();	// (���ܳ��� ���)
		}
		// �ݵ�� �����ؾ��ϴ� �κ�
		System.out.println("���α׷� ����");
	}
}
