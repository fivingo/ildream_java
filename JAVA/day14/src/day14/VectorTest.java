package day14;
// vector (���� ���� �迭), ���׸� ����
import java.util.*;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector(4, 3);	// �ʱ�ġ4, ����ġ3
		
		System.out.println("v�� ũ��: " + v.capacity());		// vector�� �뷮 ��ȯ
		System.out.println("v�� ����� ������ ��: " + v.size());	// vector�� ��Ҽ� ��ȯ
		
		for (int i = 1; i <= 9;i++) {
			v.add(i);	// �� ���� (������ �߰�) - autoboxing 
		} 
		
		System.out.println("v�� ũ��: " + v.capacity());
		System.out.println("v�� ����� ������ ��: " + v.size());
		
		v.add(new Double(1.23));	// ��ü �ּҰ� ����
		v.add(2.34);	// �Ǽ� ����
		v.add("hello");	// ���ڿ� ����
		
		System.out.println("v�� ũ��: " + v.capacity());
		System.out.println("v�� ����� ������ ��: " + v.size());
		
		System.out.println("v�� 3��° ��Ұ�: " + v.get(3));	// vector ������� ��ȯ
		
		int in = (Integer) v.get(6);	// unboxing: Integer ���۷��� Ÿ�� (int x)
		System.out.println("in = " + in);
		Object obj = v.get(6);	// Vector�� ����Ŭ���� Object (������)
		System.out.println("obg = " + obj);
		
		// ���׸� - �÷��ǿ� ����Ǵ� �������� Ÿ�� ����
		Vector<String> v2 = new Vector<String>();	// �� ���׸� ����x (����������x)
		v2.add("hello");
		v2.add("hi");
		v2.add("java");
		v2.add("jsp");
		
		for (int i = 0; i < v2.size(); i++) {
			String temp = v2.get(i);	// ĳ���� ���ʿ� - ���׸� String Ÿ�� ����
			System.out.println(temp);
		}
		
		// ArrayList�� ��
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(100);
		arr.add(200);
		
		for (int i = 0; i < arr.size(); i++) {
			Integer temp = arr.get(i);
			System.out.println(temp);
		}
	}
}
