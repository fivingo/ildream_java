package jdbctest;
//JDBC ����3 - SELECT Ȱ��
import java.sql.*;

public class MyJdbc3 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			// Statement
//			Statement st = conn.createStatement();	// ��ü ���� �� ���� �Է�
//			String sql = "SELECT * FROM student";
//			ResultSet rs = st.executeQuery(sql);	// ������ Ŭ���� (while ���)
//			while (rs.next()) {	// ���� ������ ���� Ȯ��
//				String name = rs.getString("name");	// getXXX �޼���� �� Ȯ��
//				int age = rs.getInt("age");			// ���ڰ�: column_name
//				String tel = rs.getString(3);		// column_index �Է� ���� (����)
//				String addr = rs.getString(4);
//				System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
//			}
			
			// PreparedStatement
			String sql = "SELECT * FROM student";	// ���� �Է� �� ��ü ����
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				System.out.println(name + "\t" + age + "\t" + tel + "\t" + addr);
			}
			
			// ��� �ڿ� ��ȯ
			rs.close();
//			st.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
