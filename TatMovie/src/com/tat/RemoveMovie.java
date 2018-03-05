package com.tat;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Servlet implementation class RemoveMovie
 */
@WebServlet("/RemoveMovie")
public class RemoveMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		JSONArray array = new JSONArray();
		JSONObject movie = new JSONObject();

		// setting response type
		response.setContentType("application/json");
		// getting the movie to delete from request
		String moviename = request.getParameter("moviename");
		// sending the response
		PrintWriter out = response.getWriter();
		// showing the movie deleted
		out.print("Removing <b>" + moviename + "</b> from your favorite locations");
		// opening the file
		String fileName = "/TatMovie/favorit.json";
		JSONParser parser = new JSONParser();
		try {
			// parsing the file into json array
			array = (JSONArray) parser.parse(new FileReader(fileName));
			// if id exists, do not add and return error
			for (int looper = 0; looper < array.size(); looper++) {
				movie = (JSONObject) array.get(looper);
				// matching the movie with json
				if (String.valueOf(movie.get("moviename")).equals(String.valueOf(moviename))) {
					// if found remove entire array
					array.remove(looper);
					FileWriter jsonFile = null;
					try {
						jsonFile = new FileWriter(
								"/home/sapient/favorit.json");
						jsonFile.write(array.toString());
					} catch (Exception e) {
						System.out.println("Please enter a valid path where you want to store your json");
					} finally {
						jsonFile.flush();
						jsonFile.close();
					}
					break;
				}
			}
		} catch (Exception e) {
			// if exception occurs
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
