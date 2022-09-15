package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*날자 : 2022/09/15
 *이름 : 황원진
 * 내용 : JDBC
 */
public class SelectTest {
	public static void main(String[] args) {
		//DB
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
			
		try {
		//1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		//2단계
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3단계
		Statement stmt = conn.createStatement();
		
		//4단계
		String sql = "SELECT * from `User1`;";
		ResultSet rs = stmt.executeQuery(sql);
		
		//5단계-SELETE 결과처리
		while(rs.next()) {
			
			String uid = rs.getString(1);
			String name = rs.getString(2);
			String hp = rs.getString(3);
			int age = rs.getInt(4);
		
		System.out.printf("%s, %s, %s, %d\n", uid, name, hp, age);
		
		}
		
		//6단계
		rs.close();
		stmt.close();
		conn.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 종료");
		}
}
