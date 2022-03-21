package Jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentDataBase {
public static boolean insertStudentToDB(Student st) {
	boolean f=false;
	try {
	Connection con=	JdbcConnection.createCon();
	String q="insert into students(Fname,PhoneNumber,city) values(?,?,?)";
   PreparedStatement pstmt= con.prepareStatement(q);
	
	pstmt.setString(1, st.getStudentName());
	pstmt.setString(2, st.getStudentPhone());
	pstmt.setString(3, st.getStudentCity());

    pstmt.executeUpdate();
    f=true;
    
	}catch(Exception e) {
	System.out.println(e);
}
	
	return f;
	}

public static boolean deleteStudent(int userID) {
	boolean f=false;
	try {
	Connection con=	JdbcConnection.createCon();
	String q="delete from students where StudentID=?";
   PreparedStatement pstmt= con.prepareStatement(q);
	
	pstmt.setInt(1, userID);
	
    pstmt.executeUpdate();
    f=true;
    
	}catch(Exception e) {
	System.out.println(e);
}
	
return f;
	}

public static void showAllStudent() {
	try {
	Connection con=	JdbcConnection.createCon();
	String q="select *from Students;";
   Statement stmt=con.createStatement();
    ResultSet set=stmt.executeQuery(q);
    while(set.next()) {
    	int id=set.getInt(1);
    	String name=set.getString(2);
    	String phone=set.getString(3);
    	String city=set.getString("city");
         
    	System.out.println("ID : "+id);
    	System.out.println("Name :"+name);
    	System.out.println("PhoneNumber : "+phone);
    	System.out.println("City : "+city);


    	
    }
    }catch(Exception e) {
	System.out.println(e);
}
	

	
}
}