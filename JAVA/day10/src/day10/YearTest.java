package day10;
// overloading ����2 Ȱ��
public class YearTest { 
	public static void main(String[] args) {
		Year y1 = new Year(2016);
		y1.getInfo();
		
		Year y2 = new Year();
		y2.getInfo(2017);
	}
}
