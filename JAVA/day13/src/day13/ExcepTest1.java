package day13;
// ����ó�� 1
public class ExcepTest1 {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		
		try {
			String str = null;
			
			// (��� ��ü�� �ڵ����� toString() ȣ��)
			System.out.println("str = " + str.toString());
		} catch(NullPointerException e) {
			System.out.println("str�� ����ֽ��ϴ�.");
			e.printStackTrace();	// ���ܿ����� �������
		}
		
		System.out.println("���α׷��� ��");
	}
}
