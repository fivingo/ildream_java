package day14;
// StringŬ���� - ���ڿ����� Ư�� ���ڿ� ���� Ȯ��
import java.util.*;

public class StringTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[10];
		arr[0] = "jsp��";
		arr[1] = "java��";
		arr[2] = "jsp����";
		arr[3] = "java�ΰ���?";
		arr[4] = "java�Դϴ�";
		arr[5] = "java�����?";
		arr[6] = "jsp������";
		arr[7] = "java�����ϴ�.";
		arr[8] = "jsp�ƴҰ�";
		arr[9] = "jsp�� ����";
		
		System.out.println("�˻�� �Է����ּ���");
		System.out.print("> ");
		String find = sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains(find)) {	// �Ǵ� startsWith: ���� ���ڿ� ���� �Ǵ�
				System.out.println(arr[i]);
			}
		}
	}
}
