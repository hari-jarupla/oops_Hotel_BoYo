package main.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSetUP {
	
	private String databaseName;
	private String url;
	private String username;
	private String password;
	private Connection conn;
	
	public SqlSetUP(){
		this.databaseName = "sql6453555";
		this.url = "jdbc:mysql://sql6.freemysqlhosting.net/sql6453555";
		this.username = "sql6453555";
		this.password = "I4UFFpMYVa";
		getConnection();
		boolean res = setUPTables();
		if(!res) System.out.println("error 500");
	}
	public SqlSetUP(String DatabaseName, String userName, String passWord){
		this.databaseName = DatabaseName;
		this.username = userName;
		this.password = passWord;
		try {

			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user="+ username +"&password="+ password, userName, passWord);
			this.conn = Conn;
			Statement s = Conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + databaseName);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.url = "jdbc:mysql://localhost:3306/" + databaseName;
		getConnection();
		boolean res = setUPTables();
		if(!res) System.out.println("error 500");
	}
	@Deprecated
	public SqlSetUP(String DatabaseName, String URL, String userName, String passWord){
		this.databaseName = DatabaseName;
		this.url = URL;
		this.username = userName;
		this.password = passWord;
		getConnection();		
		boolean res = setUPTables();
		if(!res) System.out.println("error 500");
	}
	
	
	private void getConnection() {	
		conn = null;
		try {		
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			Statement s = conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + databaseName);
			System.out.println(result);
						
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	private boolean setUPTables() {	
		String userTable = "CREATE TABLE IF NOT EXISTS usertable ( "
				+ "ID int NOT NULL AUTO_INCREMENT," 
				+ "UserID varchar(255) NOT NULL, "
				+ "username varchar(255), "
				+ "mobile varchar(255), "
				+ "password varchar(255) NOT NULL, "
				+ "roomno int, "
				+ "NumGuest int, "
				+ "foodcost int, "
				+ "roomtype varchar(255), "
				+ "roomcost int, "
				+ "vip int NOT NULL, "
				+ "hallcost int, "
				+ "checkin_out varchar(255), "
				+ "prevtransactionID int, "
				+ "PRIMARY KEY (ID) );";
		
		String roomTable = "CREATE TABLE IF NOT EXISTS roomtable ( "
				+ "ID int NOT NULL AUTO_INCREMENT," 
				+ "roomno int, "
				+ "roomcost int, "
				+ "roomtype varchar(255), "
				+ "UserID varchar(255), "
				+ "numGuest int, "
				+ "availability int, "
				+ "PRIMARY KEY (ID) );";
		
		String availTable = "CREATE TABLE IF NOT EXISTS availtable ( "
				+ "ID int NOT NULL AUTO_INCREMENT," 
				+ "timeslot varchar(255) NOT NULL, "
				+ "gym int, "
				+ "gaming int, "
				+ "hall int, "
				+ "spa int, "
				+ "meeting int, "
				+ "PRIMARY KEY (ID) );";
		
		PreparedStatement create;	
		try {
			create = conn.prepareStatement(userTable);
			create.executeUpdate();
			create = conn.prepareStatement(roomTable);
			create.executeUpdate();
			create = conn.prepareStatement(availTable);
			create.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return false;		
	}
	
}
