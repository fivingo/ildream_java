package day12;
// �л���� ���α׷� ������ ����  - ������
public class TeacherManagement extends EducationManagement {
	private String subject;	// ����
	
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
