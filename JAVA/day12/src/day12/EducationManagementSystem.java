package day12;
// 학사관리 시스템

import java.io.*;

public class EducationManagementSystem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=========================");
		System.out.println("학사관리 프로그램 (EMS) v1.0");
		System.out.println("=========================");
		printMenu();
		System.out.println();

		String name = null;	// 이름
		int age = 0;		// 나이
		int user = 0;		// 사용자 메뉴선택
		String subject = null;	// 과목
		String major = null;	// 전공
		EducationManagement em[] = new EducationManagement[10];	// 데이터 저장 배열
		
		while (true) {
			System.out.print("선택> ");
			user = Integer.parseInt(br.readLine());
			System.out.println();
			switch (user) {
				case 1:
					System.out.println("=선생님 정보 입력=");
					for (int i = 0; i < em.length; i++) {
						if (em[i] == null ) {
							em[i] = new TeacherManagement();
							
							System.out.print("이름> ");
							name = br.readLine();
							System.out.print("나이> ");
							age = Integer.parseInt(br.readLine());
							System.out.print("과목> ");
							subject = br.readLine();
							
							((TeacherManagement) em[i]).setInfo(name, age, subject);
							System.out.println();
							break;
						} else if (em[em.length - 1] != null) {
							System.out.println();
							System.out.println("DB에 여유공간이 없습니다.");
							System.out.println();
							break;
						}
					}
					break;
				case 2:
					System.out.println("=학생 정보 입력=");
					for (int i = 0; i < em.length; i++) {
						if (em[i] == null ) {
							em[i] = new StudentManagement();
							
							System.out.print("이름> ");
							name = br.readLine();
							System.out.print("나이> ");
							age = Integer.parseInt(br.readLine());
							System.out.print("전공> ");
							major = br.readLine();
							
							((StudentManagement) em[i]).setInfo(name, age, major);
							System.out.println();
							break;
						} else if (em[em.length - 1] != null) {
							System.out.println();
							System.out.println("DB에 여유공간이 없습니다.");
							System.out.println();
							break;
						}
					}
					break;
				case 3:
					System.out.println("=선생님 정보 확인=");
					for (int i = 0; i < em.length; i++) {
						if (em[0] != null) {
							if (em[i] instanceof TeacherManagement) {
								System.out.println("이름: " + (em[i]).getName());
								System.out.println("나이: " + (em[i]).getAge());
								System.out.println("과목: " + ((TeacherManagement) em[i]).getSubject());
								System.out.println();
							}
						} else {
							System.out.println("저장된 데이터가 없습니다.");
							System.out.println();
							break;
						}
					}
					break;
				case 4:
					System.out.println("=학생 정보 확인=");
					for (int i = 0; i < em.length; i++) {
						if (em[0] != null) {
							if (em[i] instanceof StudentManagement) {
								System.out.println("이름: " + em[i].getName());
								System.out.println("나이: " + em[i].getAge());
								System.out.println("전공: " + ((StudentManagement) em[i]).getMajor());
								System.out.println();
							}
						} else {
							System.out.println("저장된 데이터가 없습니다.");		
							System.out.println();
							break;
						}
					}
					break;
				case 5:
					System.out.println("=모든 정보 확인=");
					System.out.println();
					for (int i = 0; i < em.length; i++) {
						if (em[0] != null) {
							if (em[i] instanceof TeacherManagement) {
								System.out.println("-선생님-");
								System.out.println("이름: " + em[i].getName());
								System.out.println("나이: " + em[i].getAge());
								System.out.println("과목: " + ((TeacherManagement) em[i]).getSubject());
								System.out.println();
							} else if (em[i] instanceof StudentManagement) {
								System.out.println("-학생놈-");
								System.out.println("이름: " + em[i].getName());
								System.out.println("나이: " + em[i].getAge());
								System.out.println("전공: " + ((StudentManagement) em[i]).getMajor());
								System.out.println();
							}
						} else {
							System.out.println("저장된 데이터가 없습니다.");				
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
					System.out.println("-프로그램을 종료합니다. 굿바이-");
					System.exit(0);
				default:
					System.out.println("제대로 선택하셈");
					System.out.println();
			}
		}
	}
	
	// 메뉴출력 메서드
	public static void printMenu() {
		System.out.println("1. 선생님 정보 입력");
		System.out.println("2. 학생 정보 입력");
		System.out.println("3. 선생님 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 모든 정보 확인");
		System.out.println("6. 메뉴보기");
		System.out.println("0. 종료");
	}
}
