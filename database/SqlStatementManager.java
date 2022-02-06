package main.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlStatementManager {
	
	private String databaseName;
	private String url;
	private String username;
	private String password;
	Connection conn;
	
	@Deprecated
	public SqlStatementManager() {
		this.databaseName = "sql6453555";
		this.url = "jdbc:mysql://sql6.freemysqlhosting.net/sql6453555";
		this.username = "sql6453555";
		this.password = "I4UFFpMYVa";
		
		Connection Conn;
		try {
			Conn = getConnection();
			Statement s = Conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + databaseName);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}	
	public SqlStatementManager(String DatabaseName, String userName, String passWord) {
		this.databaseName = DatabaseName;
		this.url = "jdbc:mysql://localhost:3306/" + databaseName;
		this.username = userName;
		this.password = passWord;
		
		conn = getConnection();	
		if(conn == null) {
			System.out.println("Connection not made");
		}
	}
	
	
	/**
	 *  Sets up connection with our database
	 *  @return
	 */
	public Connection getConnection() {
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
	
			return conn;
			
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	public String getDatabaseName() {
		return databaseName;
	}
	public String getURL() {
		return url;
	}
	
/*
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ---------------------DONT USE ANY OF THE METHODS BELOW, ONLY USE THIS CLASS FOR SETTUNG UP CONNCTION TO A DATABASE------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 */

	
	/**
	 * For creating table in connected database
	 * -uses getConnection() with pre-provided login info
	 * @throws Exception
	 * 
	 */
	@Deprecated
	public void createTable() throws Exception{
		try {
			
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement(
					"CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Done");}
	}
	
	/**
	 * For creating table in connected database
	 * -uses getConnection() with pre-provided login info
	 * @param createTableSQL - SQL statement for creating table, example: 'CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))'
	 * @throws Exception
	 */
	public void createTable(String createTableSQL) throws Exception{
		try {
			
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement(createTableSQL);
			create.executeUpdate();
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Table created");}
	}
	
	
	/**
	 * These methods are for insert statement, second method takes insert statement as @param
	 * -uses getConnection() with pre-provided login info
	 * @throws Exception
	 */
	@Deprecated
	public void post() throws Exception{	
		final String var1 = "john";
		final String var2 = "miller";
		try {			
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO tablename (first, last) VALUES ('" + var1 + "', '" + var2 + "')");
			posted.executeUpdate();					
		} catch(Exception e) { System.out.println(e); }
		
		finally {System.out.println("Insert completed");}
	}
	/**
	 * For inserting data in connected database
	 * @param insertStatement - SQL statement for inserting in table, example: 'INSERT INTO tablename (first, last) VALUES ('" + var1 + "', '" + var2 + "')'
	 * @throws Exception
	 */
	public void post(String insertStatement) throws Exception{
		try {		
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement(insertStatement);
			posted.executeUpdate();				
		} catch(Exception e) { System.out.println(e); }
		
		finally {System.out.println("Insert completed");}
	}
	
	
	/**
	 * For selecting data out of connected database
	 * @return
	 */
	public ArrayList<String> get() {
		try {
			Connection con = getConnection();
			//PreparedStatement statement = con.prepareStatement("SELECT * FROM tablename");
			PreparedStatement statement = con.prepareStatement("SELECT first, last FROM tablename");
			
			ResultSet result = statement.executeQuery();
			//storing result according to ur need, here stored last in array list and printing first and last to console
			ArrayList<String> arr = new ArrayList<>();
			while(result.next()) {
				System.out.print(result.getString("first"));
				System.out.print(" ");
				System.out.println(result.getString("first"));
				
				arr.add(result.getString("last"));
			}
			System.out.println("All records have been selected");
			return arr;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}	
	
	/**
	 * For selecting data out of connected database
	 * @param selesctStatement - SQL statement for inserting in table, example: 'SELECT first, last FROM tablename'
	 * @return
	 */
	public ArrayList<String> get(String selesctStatement) {
		try {
			Connection con = getConnection();
			//PreparedStatement statement = con.prepareStatement("SELECT * FROM tablename");
			PreparedStatement statement = con.prepareStatement(selesctStatement);
			
			ResultSet result = statement.executeQuery();
			
			//to do incomplete
			ArrayList<String> arr = new ArrayList<>();
			while(result.next()) {
				System.out.println(result.getString("first"));
				
				arr.add(result.getString("last"));
			}
			System.out.println("All records have been selected");
			return arr;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}
	
	
	/**
	 * To create database 
	 */
	@Deprecated
	public void setUpDatabase() {
		Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootPass");
			Statement s = Conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE hotelBoYoDB");
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Deprecated
	public void setUpDatabase(String username, String password) {
		Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user="+ username +"&password="+ password);
			Statement s = Conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE hotelBoYoDB");
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
}
