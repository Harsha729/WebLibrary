package com.project.serch;

import java.sql.ResultSet;

public class SearchContext {
	
	

	private SearchOperation soperation;
	
	public SearchContext(SearchOperation soperation){
		
		this.soperation=soperation;
		
	}

	public ResultSet executeSearch(String name, String type){
		return soperation.doSearch(name, type);
	}
	
}
