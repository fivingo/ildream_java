package day14;
// HashMap ����
import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("���", "apple");		// key, value: �� ���� (������ ����)
		map.put("�ٳ���", "banana");
		map.put("plate", "����");
		
		System.out.println("��� ����� ����? " + map.get("���"));
		System.out.println("plate �����̳�? " + map.get("plate"));
		
		map.put("���", "������");
		System.out.println("��� ����� ����? " + map.get("���"));	// ������ ����
	}
}
