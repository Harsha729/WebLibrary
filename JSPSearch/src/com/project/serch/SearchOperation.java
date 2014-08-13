package com.project.serch;

import java.sql.ResultSet;

public interface SearchOperation {
	
	public ResultSet  doSearch( String name, String type );

}
