package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	static Connection con;
public static Connection createCon() {
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user="root";
	String password="Netid^7310";
	String url="jdbc:mysql://localhost:3306/student_management";
	 con=DriverManager.getConnection(url, user, password);
	
	}catch(Exception e) {
		System.out.println(e);
	}
	return con;

}
}
