package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String Id=request.getParameter("id");
	String Name=request.getParameter("name");
	String[] hobbies=request.getParameterValues("hobbies");
	String gender=request.getParameter("gender");
	String city=request.getParameter("city");
	String state=request.getParameter("state");
	String country=request.getParameter("country");
	
	out.println("id is"+Id);
	out.println("name is"+Name);
	for (String string : hobbies) {
		out.println("hobbies are"+string);
	}
	out.println("gender is"+gender);
	out.println("City is"+city);
	out.println("state is"+state);
	out.println("country is"+country);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
