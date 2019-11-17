package day10;
// overloading 예시2
public class Year {
	int year;
	String leapYear;
	
	public Year() {
		year = 0;
		leapYear = "평년";
	}
	public Year(int year) {
		this.year = year;
		setLeapYear(year);
	}
	
	public void setLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = "윤년";
		}
	}
	public void getInfo() {
		setLeapYear(year);
		System.out.println(year + "년은 " + leapYear + "입니다.");
	}
	public void getInfo(int year) {
		this.year = year;
		setLeapYear(year);
		System.out.println(this.year + "년은 " + leapYear + "입니다.");
	}
}
