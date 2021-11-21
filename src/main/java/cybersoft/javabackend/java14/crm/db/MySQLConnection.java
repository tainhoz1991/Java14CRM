package cybersoft.javabackend.java14.crm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cybersoft.javabackend.java14.crm.util.Dbconst;

public class MySQLConnection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(Dbconst.MYSQL_URL, Dbconst.USERNAME, Dbconst.PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Khong tim thay driver MySQL Connection J.");
		} catch (SQLException e) {
			System.out.println("Khong ket noi duoc");
			e.printStackTrace();
		}
		return null;
	}
}
