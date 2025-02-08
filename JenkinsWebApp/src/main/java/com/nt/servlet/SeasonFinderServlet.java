package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/seasonurl")
public class SeasonFinderServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// set response content type
		res.setContentType("text/html");
		//get PrintWriter 
		PrintWriter pw=res.getWriter();
		//  get System  date
		LocalDate  ld=LocalDate.now();
		//get current month of the year
		int month=ld.getMonthValue();
		//generate the season
		if(month>=3 && month<=6)
			pw.println("<h1 style='color:red;text-align:center'>Summer  Season </h1> ");
		else if(month>=7 && month<=10)
			pw.println("<h1 style='color:blue;text-align:center'>Rainy  Season </h1> ");
		else
			pw.println("<h1 style='color:green;text-align:center'>winter  Season </h1> ");
		
	    //add home hyperlink
		pw.println("<br><br> <b> <a href='index.jsp'>home </a>");
		
		//close stream
		pw.close();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
