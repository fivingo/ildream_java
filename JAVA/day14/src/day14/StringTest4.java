package day14;
// StringŬ����: ���� �Һ��� ��Ģ (���������� �Ѽ� �Ұ�)
// StringBufferŬ����: String�� ���������Ұ� ����
public class StringTest4 {
	public static void main(String[] args) {
		String str = "hello java";
		System.out.println("str = " + str);
		
		// str.concat(" hi jsp")	// str���� �ٲ����ʴ´�.
		String str_c = str.concat(" hi jsp");	// ���� ���ڿ��� �� ���ڿ� �������� ���� �� ��ȯ
		System.out.println("str = " + str_c);

		// str.substring(2, 4)		// str���� �ٲ����ʴ´�.
		String str_s = str.substring(2, 4);		// ������ �ε��� ���� ���ڿ� ��ȯ 
		System.out.println("str = " + str_s);
		
		// StringBuffer�� ��ü ���� �ʿ�
		StringBuffer sb = new StringBuffer("hello java!!");
		System.out.println("sb = " + sb);
		
		sb.insert(6, "jsp!!");	// ���ڿ� ����
		System.out.println("sb = " + sb);
		
		sb.append("hi!!");		// ���ڿ� ����
		System.out.println("sb = " + sb);
		
		sb.delete(11, 16);		// ���ڿ� ����
		System.out.println("sb = " + sb);
	}
}
