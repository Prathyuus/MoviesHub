package com.tat;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveFromJson
 */
@WebServlet("/RetriveFromJson")
public class RetriveFromJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// setting the response tyoe
				PrintWriter out = response.getWriter();
				// creating json parser and array to retrieve value from json
				JSONParser parser = new JSONParser();
				JSONArray arr = new JSONArray();
				try {
					// opening the file and parsing json object
					arr = (JSONArray) parser
							.parse(new FileReader("/TatMovie/favorit.json"));
					// sending the response
					out.println(arr);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
