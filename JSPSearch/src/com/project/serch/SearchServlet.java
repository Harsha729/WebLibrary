package com.project.serch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		
		SearchContext context;
		ResultSet searchresults;
		String searchname = request.getParameter("search");
		System.out.println("Searchname is :" + searchname);
		String searchtype = request.getParameter("select");
		System.out.println("search type is :" + searchtype);
		if(searchtype.equals("bookname")){
		context = new SearchContext(new BookSearch());
		searchresults = context.executeSearch(searchname, searchtype);
		System.out.println("In Book Search :");
		try{
		String bookname = searchresults.getString("bookname");
		int id = searchresults.getInt("category_id");
        int rating = searchresults.getInt("rating");
        
        System.out.println("VALUES ARE" + bookname + id + rating);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
		context = new SearchContext(new NullSearch());
		searchresults = context.executeSearch(searchname, searchtype);
		System.out.println("In Null Search" );
		}
	}

}
