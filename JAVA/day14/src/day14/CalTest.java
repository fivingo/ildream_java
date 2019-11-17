package day14;
// Calender Ŭ���� ���� (��ǥ���� Singleton ���)
import java.util.*;

public class CalTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 0���� ����
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "�� " + month + "�� " + day + "�� " 
						+ hour + "�� " + minute + "�� " + second + "��");
		
		int am_pm = now.get(Calendar.AM_PM);		// ���� 0 / ���� 1
		int week = now.get(Calendar.DAY_OF_WEEK);	// ��-�� (1-7)
		System.out.println(am_pm + " / " + week);
	}
}
