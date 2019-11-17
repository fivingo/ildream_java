package day13;
// ����ó�� + finally
import java.io.*;

public class ExcepTest5 {
	public static void main(String[] args){
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int dataNumber = 0;		// �������Է� ����
		int printNumber = 0;	// ��������� ����
		
		try {
			System.out.print("������ � �Է�?> ");
			dataNumber = Integer.parseInt(br.readLine());
			int dataArr[] = new int[dataNumber];	// ���������� �迭
			for (int i = 0; i < dataArr.length; i++) {
				System.out.print("������" + (i + 1) + "> ");
				dataArr[i] = Integer.parseInt(br.readLine());
			}
			
			System.out.print("���° ���?> ");
			printNumber = Integer.parseInt(br.readLine()) - 1;
			System.out.println("�����Ѱ�: " + dataArr[printNumber]);
		} catch (IOException e) {				// ����� ����
		} catch (NumberFormatException e) {		// �����̿ܰ� ����
			System.out.println("������ �Է��ض�");
		} catch (ArrayIndexOutOfBoundsException e) {	// �迭�ε��� ����� ���� 
			System.out.println("�ε�����ȣ �����ȿ��� �Է��ض�");
		} catch (NegativeArraySizeException e) {		// �迭���� ������ ����
			System.out.println("�迭 ������ ����� �Է��ض�");
		} catch (Exception e) {					// ������ ��� ����	
			System.out.println("�ϴ� ���� �߸���");
		} finally {	// ���� �� (������)�ڿ��� ������ ������� �Ѵٸ� - �� ���
			try {	// try~catch~finally-try~catch - �����߽� ������ ���
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
