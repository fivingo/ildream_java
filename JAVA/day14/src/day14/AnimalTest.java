package day14;

import java.io.*;

public class AnimalTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1.������ 2.������ 3.����");
		System.out.print("� ������ �¾����? > ");

		String kindAnimal;
		kindAnimal = br.readLine();
		
		if (kindAnimal.equals("������")) {
			System.out.println("�������� ���������췷���ϰ� ¢���~");
		} else if (kindAnimal.equals("������")) {
			System.out.println("�����̰� ��������ϰ� ¥������ �����~");
		} else if (kindAnimal.equals("����")) {
			System.out.println("������ �а��ϤӂE�ϰ� ����~");
		} else {
			System.out.println("����� �Է��ϼ�");
		}
	}
}
