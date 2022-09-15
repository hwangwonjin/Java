package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*날짜 : 2022/09/15
 *이름 ㅣ 황원진
 *내용 : 트랜잭션 실습하기
 *
 *트랜잭션
 *	트랜잭션은 DB처리에 최소 작업단위로 하나의 작업은 소작업들로 구성
 *	트랜잭션 작업은 모두 성공이거나 모두 실패해야만 하는 특성을 가짐
 *	commit은 모든 작업의 성공적 처리, rollback은 모든 작업의 실패처리
 *
 */
public class TransactionTest {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생시키겠습니까?");
		int answer = sc.nextInt();
		
		//DB
		String host = "jdbc:mysql://127.0.0.1:3306/java2_bank";
		String user = "root";
		String pass = "1234";
			
		String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - 10000 WHERE `a_no`=?;";
		String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + 10000 WHERE `a_no`=?;";
		
		
		try {
		//1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		//2단계
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//트랜잭션 시작
		conn.setAutoCommit(false);
		//3단계
		
		PreparedStatement psmt1 = conn.prepareStatement(sql1);
		psmt1.setString(1, "101-11-1001");
		
		PreparedStatement psmt2 = conn.prepareStatement(sql2);
		psmt2.setString(1, "101-22-1006");
		//4단계
		psmt1.executeUpdate();
		
		if(answer == 1) {
			throw new Exception("의도치 않은 에러발생!!");
		}
		
		psmt2.executeUpdate();
		
		//트랜잭션 확정
		conn.commit();
		
		//5단계
		//6단계
		psmt1.close();
		psmt2.close();
		conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	System.out.println("프로그램 종료");
	
	
	}
}
