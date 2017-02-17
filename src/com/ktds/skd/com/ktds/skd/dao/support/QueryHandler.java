package com.ktds.skd.com.ktds.skd.dao.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryHandler {

	// 쿼리를 생성해서 return
	public String preparedQuery();

	// 쿼리에 파라미터가 존재하는 경우 파라미터에 데이터를 매핑시켜준다.
	public void mappingParameters(PreparedStatement stmt) throws SQLException;

	// 리스트or객체 에서 데이터를 받아온다.
	public Object getData(ResultSet rs);

}
