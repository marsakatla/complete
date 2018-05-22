package com.ts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FinalPrice
 */
public class FinalPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalPrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vtype=request.getParameter("vehicle");
		String Einsurance=request.getParameter("Earlier Insurance");
		String Dclass=request.getParameter("Driver Class");
		String ASF=request.getParameter("Adv Security");
		String ATA=request.getParameter("Anti Theft");
		String VH=request.getParameter("Violation");
		String PT=request.getParameter("Policy Term");
		double finalprice=new InsuranceDAO().FinalPrice(vtype, Einsurance, Dclass, ASF, ATA, VH, PT);
		PrintWriter p=response.getWriter();
		p.write("<h3> Total amount payble is :"+String.valueOf(finalprice)+"</h3>");
	}

}
