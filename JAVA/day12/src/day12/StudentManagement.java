package day12;
// 학사관리 프로그램 데이터 관리  - 학생
public class StudentManagement extends EducationManagement {
	private String major;	// 전공

	// get set
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setInfo(String name, int age, String major) {
		setName(name);
		setAge(age);
		setMajor(major);
	}
}
