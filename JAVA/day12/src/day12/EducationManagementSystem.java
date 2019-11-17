package day12;
// �л���� �ý���

import java.io.*;

public class EducationManagementSystem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=========================");
		System.out.println("�л���� ���α׷� (EMS) v1.0");
		System.out.println("=========================");
		printMenu();
		System.out.println();

		String name = null;	// �̸�
		int age = 0;		// ����
		int user = 0;		// ����� �޴�����
		String subject = null;	// ����
		String major = null;	// ����
		EducationManagement em[] = new EducationManagement[10];	// ������ ���� �迭
		
		while (true) {
			System.out.print("����> ");
			user = Integer.parseInt(br.readLine());
			System.out.println();
			switch (user) {
				case 1:
					System.out.println("=������ ���� �Է�=");
					for (int i = 0; i < em.length; i++) {
						if (em[i] == null ) {
							em[i] = new TeacherManagement();
							
							System.out.print("�̸�> ");
							name = br.readLine();
							System.out.print("����> ");
							age = Integer.parseInt(br.readLine());
							System.out.print("����> ");
							subject = br.readLine();
							
							((TeacherManagement) em[i]).setInfo(name, age, subject);
							System.out.println();
							break;
						} else if (em[em.length - 1] != null) {
							System.out.println();
							System.out.println("DB�� ���������� �����ϴ�.");
							System.out.println();
							break;
						}
					}
					break;
				case 2:
					System.out.println("=�л� ���� �Է�=");
					for (int i = 0; i < em.length; i++) {
						if (em[i] == null ) {
							em[i] = new StudentManagement();
							
							System.out.print("�̸�> ");
							name = br.readLine();
							System.out.print("����> ");
							age = Integer.parseInt(br.readLine());
							System.out.print("����> ");
							major = br.readLine();
							
							((StudentManagement) em[i]).setInfo(name, age, major);
							System.out.println();
							break;
						} else if (em[em.length - 1] != null) {
							System.out.println();
							System.out.println("DB�� ���������� �����ϴ�.");
							System.out.println();
							break;
						}
					}
					break;
				case 3:
					System.out.println("=������ ���� Ȯ��=");
					for (int i = 0; i < em.length; i++) {
						if (em[0] != null) {
							if (em[i] instanceof TeacherManagement) {
								System.out.println("�̸�: " + (em[i]).getName());
								System.out.println("����: " + (em[i]).getAge());
								System.out.println("����: " + ((TeacherManagement) em[i]).getSubject());
								System.out.println();
							}
						} else {
							System.out.println("����� �����Ͱ� �����ϴ�.");
							System.out.println();
							break;
						}
					}
					break;
				case 4:
					System.out.println("=�л� ���� Ȯ��=");
					for (int i = 0; i < em.length; i++) {
						if (em[0] != null) {
							if (em[i] instanceof StudentManagement) {
								System.out.println("�̸�: " + em[i].getName());
								System.out.println("����: " + em[i].getAge());
								System.out.println("����: " + ((StudentManagement) em[i]).getMajor());
								System.out.println();
							}
						} else {
							System.out.println("����� �����Ͱ� �����ϴ�.");		
							System.out.println();
							break;
						}
					}
					break;
				case 5:
					System.out.println("=��� ���� Ȯ��=");
					System.out.println();
					for (int i = 0; i < em.length; i++) {
						if (em[0] != null) {
							if (em[i] instanceof TeacherManagement) {
								System.out.println("-������-");
								System.out.println("�̸�: " + em[i].getName());
								System.out.println("����: " + em[i].getAge());
								System.out.println("����: " + ((TeacherManagement) em[i]).getSubject());
								System.out.println();
							} else if (em[i] instanceof StudentManagement) {
								System.out.println("-�л���-");
								System.out.println("�̸�: " + em[i].getName());
								System.out.println("����: " + em[i].getAge());
								System.out.println("����: " + ((StudentManagement) em[i]).getMajor());
								System.out.println();
							}
						} else {
							System.out.println("����� �����Ͱ� �����ϴ�.");				
							System.out.println();
							break;
						}
					}
					break;
				case 6:
					printMenu();
					System.out.println();
					break;
				case 0:
					System.out.println("-���α׷��� �����մϴ�. �¹���-");
					System.exit(0);
				default:
					System.out.println("����� �����ϼ�");
					System.out.println();
			}
		}
	}
	
	// �޴���� �޼���
	public static void printMenu() {
		System.out.println("1. ������ ���� �Է�");
		System.out.println("2. �л� ���� �Է�");
		System.out.println("3. ������ ���� Ȯ��");
		System.out.println("4. �л� ���� Ȯ��");
		System.out.println("5. ��� ���� Ȯ��");
		System.out.println("6. �޴�����");
		System.out.println("0. ����");
	}
}
