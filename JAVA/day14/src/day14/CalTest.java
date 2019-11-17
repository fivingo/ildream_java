package day14;
// Calender 클래스 기초 (대표적인 Singleton 방식)
import java.util.*;

public class CalTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 0부터 시작
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "년 " + month + "월 " + day + "일 " 
						+ hour + "시 " + minute + "분 " + second + "초");
		
		int am_pm = now.get(Calendar.AM_PM);		// 오전 0 / 오후 1
		int week = now.get(Calendar.DAY_OF_WEEK);	// 일-토 (1-7)
		System.out.println(am_pm + " / " + week);
	}
}
