package day14;
// String ���� ����
public class StringTest1 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java"); 
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		
		if (str1 == str2) {	// ���� �������� ���� ��ü ����
			System.out.println("str1 == str2: ����");
		} else {
			System.out.println("str1 == str2: �����ʴ�");
		}
		String res1 = (str1 == str3) ? "����" : "�����ʴ�";
		System.out.println("str1 == str3: " + res1);
		
		String res2 = str1.equals(str2) ? "����" : "�����ʴ�";
		String res3 = str1.equals(str3) ? "����" : "�����ʴ�";
		
		System.out.println("str1 == str2: " + res2);
		System.out.println("str1 == str3: " + res3);
	}
}
