package com.user.dao;

public class UserDAO {
	private String jdbcURL="jdbc:mysql://localhost:30006/userappdb";
	private String jdbcUserName="root";
	private String jdbcPassword="root";
	
	private static final String INSERT_USER_SQL="INSERT INTO  users"+"(uname,email,country,paddwd)VALUES "+"(?,,??);
	
	

}
