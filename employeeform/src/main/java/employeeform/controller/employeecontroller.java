package employeeform.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employeeform.dao.employeeDao;
import employeeform.model.employee;

/**
 * Servlet implementation class employeecontroller
 */
@SuppressWarnings("serial")
@WebServlet("/register")
public class employeecontroller extends HttpServlet {
	private employeeDao empdao = new employeeDao();
	
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
	RequestDispatcher req = request.getRequestDispatcher("WEB-INF/views/employee.jsp");
	req.forward(request, response);
	
}
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String username =request.getParameter("username");
	String passwords =request.getParameter("passwords");
	String address=request.getParameter("address");
	String contact=request.getParameter("contact");
	
	employee emp=new employee();
	emp.setFirstname(firstname);
	emp.setLastname(lastname);
	emp.setUsername(username);
	emp.setPasswords(passwords);
	emp.setAddress(address);
	emp.setContact(contact);
	
	try {
		empdao.mysqlconnect(emp);
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	RequestDispatcher req = request.getRequestDispatcher("WEB-INF/views/employeesuccess.jsp");
	req.forward(request, response);
	}

}
