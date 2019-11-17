package day10;
// overloading ����2
public class Year {
	int year;
	String leapYear;
	
	public Year() {
		year = 0;
		leapYear = "���";
	}
	public Year(int year) {
		this.year = year;
		setLeapYear(year);
	}
	
	public void setLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = "����";
		}
	}
	public void getInfo() {
		setLeapYear(year);
		System.out.println(year + "���� " + leapYear + "�Դϴ�.");
	}
	public void getInfo(int year) {
		this.year = year;
		setLeapYear(year);
		System.out.println(this.year + "���� " + leapYear + "�Դϴ�.");
	}
}
