package day12;
// �л���� ���α׷� ������ ����  - �л�
public class StudentManagement extends EducationManagement {
	private String major;	// ����

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
