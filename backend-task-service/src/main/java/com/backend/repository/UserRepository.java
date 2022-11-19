package com.backend.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Employee;


/**
 * @author AvinashSankineni
 *
 */
@Repository
public class UserRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @return list of data
	 */
	public List<Object[]> findData(String tablename){
		Query query = entityManager.createNativeQuery("select * from " + tablename );
		List<Object[]> user = query.getResultList();
		 
		for (Object[] obj : user) {
		    System.out.println("user  " + obj[0]+" "+ obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
		
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param asccolumnname is used to pass the column name to perform ascending order
	 * @return list of data
	 */
	public List<Object[]>findByAscSorting(String tablename,String asccolumnname){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " order by " + asccolumnname + " ASC ");
		List <Object[]> user=query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param desccolumnname is used to pass the column name to perform descending order
	 * @return list of data
	 */
	public List<Object[]>findByDescSorting(String tablename,String desccolumnname){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " order by " + desccolumnname + " DESC ");
		List <Object[]> user=query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform equalTo order
	 * @return list of data
	 */
	public List<Object[]>findByEqualTo(String tablename,String columnname,String value){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " where " + columnname + "='"+ value+"'");
		List <Object[]> user= query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform GreaterThan order
	 * @param value is used to pass the value by the user
	 * @return list of data
	 */
	public List<Object[]>findByGreaterThan(String tablename,String columnname,int value){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " where " + columnname + ">"+ value );
		List <Object[]> user=query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform LessThan order
	 * @param value is used to pass the value by the user
	 * @return list of data
	 */
	public List<Object[]>findByLessThan(String tablename,String columnname,int value){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " where " + columnname + "<"+ value );
		List <Object[]> user=query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform like order
	 * @param value is used to pass the by the user
	 * @return list of data
	 */
	public List<Object[]>findByLike(String tablename,String columnname,String value){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " where " + columnname + " like '%"+ value +"%'" );
		List <Object[]> user=query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
	
	/**
	 * @param tablename is used to retrieve the data from table
	 * @param columnname is used to pass the column name to perform Between order
	 * @param value1 is used to pass the first value
	 * @param value2 is used to pass the second value
	 * @return list of data
	 */
	public List<Object[]>findByBetween(String tablename,String columnname,int value1,int value2){
		Query query=entityManager.createNativeQuery("select * from " + tablename + " where " + columnname + ">"+ value1 +" and "+ columnname +"<"+ value2);
		List <Object[]> user=query.getResultList();
		for(Object[] obj :user) {
			System.out.println("user " + obj[0] +" "+obj[1]+" "+obj[2]+" "+obj[3]);
		}
		return user;
	}
}
