package com.hcl.ems;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchEmployServlet
 */
public class SearchEmployServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmployServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		int empId=Integer.parseInt(request.getParameter("empId"));
		Employ obj=EmployBAL.searchEmployBal(empId);
		
		if(obj != null){
			out.println("Employ id "+obj.getEmpId()+"<br/>");
			out.println("Employ Name"+obj.getEmpName()+"<br/>");
			out.println("email "+obj.getEmail()+"<br/>");
			out.println("mobile no "+obj.getMobileNo()+"<br/>");
			out.println("date joined "+obj.getDateOfJoin()+"<br/>");
			out.println("department"+obj.getDeptName()+"<br/>");
			out.println("manager id "+obj.getMgrId()+"<br/>");
			out.println("available leaves"+obj.getLeaveBal()+"<br/>");
			if(obj.getMgrId() != 0) {
				obj=EmployBAL.searchEmployBal(obj.getMgrId());
				
				out.println("Manager details"+"<br/>");
				out.println("Employ id "+obj.getEmpId()+"<br/>");
				out.println("Employ Name"+obj.getEmpName()+"<br/>");
				out.println("email "+obj.getEmail()+"<br/>");
				out.println("mobile no "+obj.getMobileNo()+"<br/>");
			}
			
		}
		
		else{
			out.println("***Employ Not Found****");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
