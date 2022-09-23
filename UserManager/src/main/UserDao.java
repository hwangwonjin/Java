package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	private static UserDao instance = new UserDao();
	public static UserDao getInstance() {
		return instance;
	}
	private UserDao() {}
	
	//DB정보
	String host = "jdbc:mysql://127.0.0.1:3306/java2db";
	private String user = "root";
	private String pass = "1234";
	
	private Connection getConnetion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host, user, pass);
		return conn;
	}
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void insertUser(User user) {
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getHp());
			psmt.setInt(4, user.getAge());
			psmt.executeUpdate();
			close();
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("아이디 또는 휴대폰 중복입니다.");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	public List<User> selectUsers(){
		List<User> users = new ArrayList<>();
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.SELECT_USERS);
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				User user = new User();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
				
				users.add(user);
			}
			close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public User selectUser(String name) {
		
		User user = new User();
		
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, name);
			
			rs = psmt.executeQuery();
					
			if(rs.next()) {
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
			}
			close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	public int deleteUser(String name) {
		int result = 0;
		
		try {
			
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, name);
			
			result = psmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(psmt != null) {
			psmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
}