package employeeform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import employeeform.model.employee;

public class employeeDao {
  public void mysqlconnect(employee empl) throws SQLException, ClassNotFoundException {
	  String url ="jdbc:mysql://localhost:3306/employee?useSSL=false";
	  String name="root";
	  String pass="2002";		  
	  String query="insert into employeeinfo (firstname,lastname,username,passwords,address,contact) values(?,?,?,?,?,?);";
	  
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con = DriverManager.getConnection(url,name,pass);
	  PreparedStatement pst=con.prepareStatement(query);
	
	  pst.setString(1,empl.getFirstname() );
	  pst.setString(2,empl.getLastname() );
	  pst.setString(3,empl.getUsername());
	  pst.setString(4,empl.getPasswords());
	  pst.setString(5,empl.getAddress());
	  pst.setString(6,empl.getContact());
	 int ans= pst.executeUpdate();
	 System.out.println("the answer is "+ans);
	 
	 
	 
	 
	 
	 
	  
	  
  }
}
