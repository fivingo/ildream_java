package day12;
// 학사관리 프로그램 데이터 관리  - 선생님
public class TeacherManagement extends EducationManagement {
	private String subject;	// 과목
	
	// get set
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setInfo(String name, int age, String subject) {
		setName(name);
		setAge(age);
		setSubject(subject);
	}
}
