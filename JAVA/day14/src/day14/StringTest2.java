package day14;
// StringŬ���� - ���ڿ����� Ư�� ���� ���� ã��
import java.io.*;

public class StringTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		char ch = 0;
		int count = 0;
		
		System.out.println("���ڿ��� �Է����ּ���");
		System.out.print("> ");
		str = br.readLine();
		
		System.out.println("ã�� ������ �Է����ּ���");
		System.out.print("> ");
		ch = (char) br.read();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {	// ���� �ε����� charŸ�� ��ȯ
				count++;
			}
		}
		
		System.out.println(count);
	}
}
