package day12;
// �л���� ���α׷� ������ ���� ����Ŭ����
public class EducationManagement {
	private String name;	// �̸�
	private int age;		// ����
	
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
