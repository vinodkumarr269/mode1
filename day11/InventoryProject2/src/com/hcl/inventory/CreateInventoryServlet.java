package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateInventoryServlet
 */
@WebServlet("/CreateInventoryServlet")
public class CreateInventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateInventoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Inventory objInventory=new Inventory();
	String stockid=new InventoryDAO().generateStockIdDao();
	objInventory.setStockid(stockid);
	objInventory.setItemName(request.getParameter("itemName"));
	int price=Integer.parseInt(request.getParameter("price"));
	objInventory.setPrice(price);
	int quantity=Integer.parseInt(request.getParameter("quantity"));
	objInventory.setQuantityAvail(quantity);
	String result=InventoryBAL.createInventory(objInventory);
	PrintWriter out=response.getWriter();
	out.println(result);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
