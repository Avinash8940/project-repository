package com.backend.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.controllers.UserController;
import com.backend.exceptions.TableNotFoundException;
import com.backend.repository.UserRepository;


@Service
public class UserServiceImpl implements IUserService {
	
	private Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;

	/**
	 *
	 */
	@Override
	public List<Object[]> getData(String tablename) {
		logger.info("inside the getData method");
		List<Object[]> objectList = userRepository.findData(tablename);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByAscSorting(String tablename,String asccolumnname) {
		logger.info("inside the getByAscSorting method");
		List<Object[]> objectList	=userRepository.findByAscSorting(tablename,asccolumnname);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");	
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByDescSorting(String tablename, String desccolumnname) {
		logger.info("inside the getByDescSorting method");
		List<Object[]> objectList	= userRepository.findByDescSorting(tablename, desccolumnname);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByEqualTo(String tablename, String columnname,String value) {
		logger.info("inside the getByEqualTo method");
		List<Object[]> objectList	= userRepository.findByEqualTo(tablename, columnname,value);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByGreaterThan(String tablename, String columnname, int value) {
		logger.info("inside the getByGreaterThan method");
		List<Object[]> objectList	= userRepository.findByGreaterThan(tablename, columnname, value);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByLessThan(String tablename, String columnname, int value) {
		logger.info("inside the getByLessThan method");
		List<Object[]> objectList	= userRepository.findByLessThan(tablename, columnname, value);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByLike(String tablename, String columnname, String value) {
		logger.info("inside the getByLike method");
		List<Object[]> objectList	= userRepository.findByLike(tablename, columnname, value);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");
		}
		logger.info("got the data");
		return objectList;
	}



	/**
	 *
	 */
	@Override
	public List<Object[]> getByBetween(String tablename, String columnname, int value1,int value2) {
		logger.info("inside the getByBetween method");
		List<Object[]> objectList	= userRepository.findByBetween(tablename, columnname, value1,value2);
		if (objectList.isEmpty()) {
			logger.warn("data not available");
			throw new TableNotFoundException("Table not found");	
		}
		logger.info("got the data");
		return objectList;
	}
}
