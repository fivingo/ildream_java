package day13;
// 학사관리 프로그램 - 수업ver
import java.io.*;

class Human {
	String name;
	int age;
	
	// 정보저장기능
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("이름: ");
		name = br.readLine();
		System.out.println("나이: ");
		age = Integer.parseInt(br.readLine());
	}
	// 정보출력기능
	public void getInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

class Teacher extends Human {
	String text;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==선생님 정보 입력==");
		super.setInfo(br);
		System.out.println("과목: ");
		text = br.readLine();
	}
	@Override
	public void getInfo() {
		System.out.println("==선생님 정보==");
		super.getInfo();
		System.out.println("과목: " + text);
	}
}

class Student extends Human{
	String major;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==학생 정보 입력==");
		super.setInfo(br);
		System.out.println("전공: ");
		major = br.readLine();
	}
	@Override
	public void getInfo() {
		System.out.println("==학생 정보==");
		super.getInfo();
		System.out.println("전공: " + major);
	}
}

public class HaksaTest {
		Human arr[];
		int count;
		
		public HaksaTest() {
			arr = new Human[10];
			count = 0;
		}
		
		/** 메뉴 출력 관련 메서드 */
		public void printMenu() {
			System.out.println("===================");
			System.out.println("학사 관리 프로그램 v1.0");
			System.out.println("-------------------");
			System.out.println("1. 선생님 정보 입력");
			System.out.println("2. 학생 정보 입력");
			System.out.println("3. 선생님 정보 출력");
			System.out.println("4. 학생 정보 입력");
			System.out.println("5. 모든 정보 출력");
			System.out.println("6. 종료");
			System.out.println("===================");
		}
		
		/** 선생님 정보 입력 관련 메서드 */
		public void setTeacherInfo(BufferedReader br) throws IOException {
			if (count >= 10) {
				System.out.println("더이상 입력하실수 없습니다.");
				return;
			}
			arr[count] = new Teacher();
			arr[count].setInfo(br);
			count++;
		}
		
		/** 학생 정보 입력 관련 메서드 */
		public void setStudentInfo(BufferedReader br) throws IOException {
			if (count >= 10) {
				System.out.println("더이상 입력하실수 없습니다.");
				return;
			}
			arr[count] = new Student();
			arr[count].setInfo(br);
			count++;
		}
		
		/** 모든 정보 출력하기 관련 메서드 */
		public void allList() {
			for (int i = 0; i < count; i++) {
				arr[i].getInfo();
			}
		}
		
		/** 선생님 정보 출력 관련 메서드 */
		public void getTeacherInfo() {
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Teacher) {
					arr[i].getInfo();
				}
			}
		}
		
		/** 학생 정보 출력 관련 메서드 */
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
				System.out.print("메뉴> ");
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
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					default:
						System.out.println("잘못된 메뉴입니다.");
				}
			}
		}
}





























