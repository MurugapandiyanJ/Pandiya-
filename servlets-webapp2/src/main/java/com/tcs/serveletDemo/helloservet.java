package com.tcs.serveletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloservet
 */
@WebServlet("/hello")
public class helloservet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloservet() {
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
	  //TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	int n = 5;
	int i = 1;
	int fact = 1;
	while (i<=5) {
		fact*=i;
		i++;
	}
	out.println("Factorial of S is =120 ")
	}
PrintWriter out=response..getWriter();
out.println(query);
String array[] = query.split("=");
out.println(array);
int n =Integer.parseInt(array[1]);///"6"
int i=1;
Protected void dompost(HttpServletRequest,http)






	
	



