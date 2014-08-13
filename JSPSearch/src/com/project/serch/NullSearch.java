package com.project.serch;

import java.sql.ResultSet;


public class NullSearch implements SearchOperation {

	@Override
	public ResultSet doSearch(String name, String type) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
