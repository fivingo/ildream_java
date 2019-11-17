package jdbctest;
// JDBC ����1 - INSERT Ȱ��
// 1. import
import java.sql.*;

public class MyJdbc1 {
	public static void main(String[] args) {
		try {
			// 2. ����̹��� �޸𸮿� �ε�
			System.out.println("DB���� ����");
			Class.forName("oracle.jdbc.driver.OracleDriver");	// ���� Ŭ���� �ε� (��ü ����)
			System.out.println("����̹� �ε� ����");
			
			// 3. DB�� ����
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";	// ����Ŭ �����ּ�
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);	// DB ����
			System.out.println("DB���� ����");
			
			// busyness logic
			// Statement ��ü - ���� ���� ���� ���� (��ü �ϳ��� ��� ���� ���)
//			Statement st = conn.createStatement();	// ��ü ���� - �Ű�����x
//			String sql = "INSERT INTO student VALUES('�Ѹ�', 30, '032-2222-2222', '��õ')";
//			int count = st.executeUpdate(sql);		// ���� ���� �� Ƚ�� ��ȯ - �ۼ� ���� �Ű�����
//			System.out.println(count + "���� �����");
			
			// PreparedStatement ��ü - ���� ���� ���� ���� (�������� �̸� ��ü ���� �� ���ڰ� �Է�)
			String sql = "INSERT INTO student VALUES(?, ?, ?, ?)";	// ?�� �Էµ� ������
			PreparedStatement ps = conn.prepareStatement(sql);		// �ۼ��� ���� �Ű����� ��ü ����
			ps.setString(1, "������");			// setXXX �޼���� �� ����
			ps.setInt(2, 50);				// (�Ķ���� ���� (1~), ����������)
			ps.setString(3, "02-1233-3333");// ��� ���ڰ� �Է��ؾ���
			ps.setString(4, "����");
			int count = ps.executeUpdate();	// ���� ���� �� Ƚ�� ��ȯ - ���� �Ű����� x
			System.out.println(count + "���� �����");
			
			// 4. �ڿ� ��ȯ - ��������
//			st.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ��� �߸���");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�������� ����");
			e.printStackTrace();
		}
	}
}
