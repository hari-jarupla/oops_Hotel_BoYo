package main.database;

public class Main {

	public static void main(String[] args) throws Exception {
		
		SqlStatementManager sqlManage = new SqlStatementManager();
		sqlManage.getConnection();
//		sqlManage.createTable("CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
//		sqlManage.post("INSERT INTO tablename (first, last) VALUES ('Alex', 'Tamboli')");
//		sqlManage.get("SELECT * FROM tablename");

	}

}
