package main;

public class SQL {
	public static final String INSERT_USER = "INSERT INTO `USER3` VALUES(?,?,?,?);";
	public static final String SELECT_USERS = "SELECT * FROM `USER3`;";
	public static final String SELECT_USER = "SELECT * FROM `USER3` WHERE `name`=?;";
	public static final String DELETE_USER = "DELETE FROM `USER3` WHERE `uid` = ?;";
}
