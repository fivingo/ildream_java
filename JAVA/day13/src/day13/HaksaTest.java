package day13;
// �л���� ���α׷� - ����ver
import java.io.*;

class Human {
	String name;
	int age;
	
	// ����������
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("�̸�: ");
		name = br.readLine();
		System.out.println("����: ");
		age = Integer.parseInt(br.readLine());
	}
	// ������±��
	public void getInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
}

class Teacher extends Human {
	String text;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==������ ���� �Է�==");
		super.setInfo(br);
		System.out.println("����: ");
		text = br.readLine();
	}
	@Override
	public void getInfo() {
		System.out.println("==������ ����==");
		super.getInfo();
		System.out.println("����: " + text);
	}
}

class Student extends Human{
	String major;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==�л� ���� �Է�==");
		super.setInfo(br);
		System.out.println("����: ");
		major = br.readLine();
	}
	@Override
	public void getInfo() {
		System.out.println("==�л� ����==");
		super.getInfo();
		System.out.println("����: " + major);
	}
}

public class HaksaTest {
		Human arr[];
		int count;
		
		public HaksaTest() {
			arr = new Human[10];
			count = 0;
		}
		
		/** �޴� ��� ���� �޼��� */
		public void printMenu() {
			System.out.println("===================");
			System.out.println("�л� ���� ���α׷� v1.0");
			System.out.println("-------------------");
			System.out.println("1. ������ ���� �Է�");
			System.out.println("2. �л� ���� �Է�");
			System.out.println("3. ������ ���� ���");
			System.out.println("4. �л� ���� �Է�");
			System.out.println("5. ��� ���� ���");
			System.out.println("6. ����");
			System.out.println("===================");
		}
		
		/** ������ ���� �Է� ���� �޼��� */
		public void setTeacherInfo(BufferedReader br) throws IOException {
			if (count >= 10) {
				System.out.println("���̻� �Է��ϽǼ� �����ϴ�.");
				return;
			}
			arr[count] = new Teacher();
			arr[count].setInfo(br);
			count++;
		}
		
		/** �л� ���� �Է� ���� �޼��� */
		public void setStudentInfo(BufferedReader br) throws IOException {
			if (count >= 10) {
				System.out.println("���̻� �Է��ϽǼ� �����ϴ�.");
				return;
			}
			arr[count] = new Student();
			arr[count].setInfo(br);
			count++;
		}
		
		/** ��� ���� ����ϱ� ���� �޼��� */
		public void allList() {
			for (int i = 0; i < count; i++) {
				arr[i].getInfo();
			}
		}
		
		/** ������ ���� ��� ���� �޼��� */
		public void getTeacherInfo() {
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Teacher) {
					arr[i].getInfo();
				}
			}
		}
		
		/** �л� ���� ��� ���� �޼��� */
		public void getStudentInfo() {
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Student) {
					arr[i].getInfo();
				}
			}
		}
		
		public static void main(String[] args) throws IOException {
			HaksaTest ht = new HaksaTest();
			
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			
			while (true) {
				ht.printMenu();
				System.out.print("�޴�> ");
				int menu = Integer.parseInt(br.readLine());
				switch(menu) {
					case 1:
						ht.setTeacherInfo(br);
						break;
					case 2:
						ht.setStudentInfo(br);
						break;
					case 3:
						ht.getTeacherInfo();
						break;
					case 4:
						ht.getStudentInfo();
						break;
					case 5:
						ht.allList();
						break;
					case 6:
						System.out.println("���α׷��� �����մϴ�.");
						System.exit(0);
					default:
						System.out.println("�߸��� �޴��Դϴ�.");
				}
			}
		}
}





























