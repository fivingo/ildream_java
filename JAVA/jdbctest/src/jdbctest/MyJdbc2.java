package jdbctest;
// JDBC ����2 - ����� �Է�
import java.sql.*;
import java.util.*;

public class MyJdbc2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("SQL�� �Է��ϼ���.");
			System.out.print("> ");
			String sql = sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.1.4:1521:orcl";
			String user = "java12";
			String pwd = "java12";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement st = conn.createStatement();

			//String insert = "INSERT INTO student VALUES ('�����', 33, '010-4780-2963', '����')";
			//String update = "UPDATE student SET addr = '��õ' WHERE name = '�����'";
			//String delete = "DELETE FROM student WHERE name = '�����'";
			int count = st.executeUpdate(sql);
			System.out.println(count + "���� ����Ǿ����ϴ�.");

			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� ��ã��");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("������ �߸���");
			e.printStackTrace();
		}
	}
}
