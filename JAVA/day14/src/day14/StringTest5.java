package day14;
// StringTokenizer (������ Ŭ����)
import java.util.*;

public class StringTest5 {
	public static void main(String[] args) {
		String fruits = "���, ��, ����, ����";
		StringTokenizer st = new StringTokenizer(fruits, ", ");	// (���ڿ�, ������)
		
		while (st.hasMoreTokens()) {	// ���� ��ū ���� �Ǵ�
			System.out.println(st.nextToken());	// ���� ��ū ��ȯ
		}
		
		String str = "�� �� �� �� ��";
		StringTokenizer st2 = new StringTokenizer(str);	// ������ �������� �������� ����
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
