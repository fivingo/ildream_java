package day12;
// 학사관리 프로그램 데이터 관리 슈퍼클래스
public class EducationManagement {
	private String name;	// 이름
	private int age;		// 나이
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}
