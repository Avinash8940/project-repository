package com.backend.service;

import java.util.List;

public interface IUserService {
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @return list of data
	 */
	List<Object[]> getData(String tablename);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param asccolumnname is used to pass the column name to perform ascending order
	 * @return list of data
	 */
	List<Object[]> getByAscSorting(String tablename,String asccolumnname);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param desccolumnname is used to pass the column name to perform descending order
	 * @return list of data
	 */
	List<Object[]> getByDescSorting(String tablename,String desccolumnname);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform equalTo order
	 * @param value
	 * @return
	 */
	List<Object[]> getByEqualTo(String tablename,String columnname,String value);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform GreaterThan order
	 * @param value is used to pass the value by the user
	 * @return list of data
	 */
	List<Object[]> getByGreaterThan(String tablename,String columnname,int value);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform LessThan order
	 * @param value is used to pass the value by the user
	 * @return
	 */
	List<Object[]> getByLessThan(String tablename,String columnname,int value);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform like order
	 * @param value is used to pass the value by the user
	 * @return list of data
	 */
	List<Object[]> getByLike(String tablename,String columnname,String value);
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform Between order
	 * @param value1 is used to pass the first value by the user
	 * @param value2 is used to pass the second value by the user
	 * @return list of data
	 */
	List<Object[]> getByBetween(String tablename,String columnname,int value1,int value2);

}
