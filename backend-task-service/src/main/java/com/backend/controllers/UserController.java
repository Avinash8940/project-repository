package com.backend.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.UserServiceImpl;

/**
 * @author AvinashSankineni
 *
 */
@RestController
public class UserController {
	
	private Logger logger=LoggerFactory.getLogger(UserController.class);
	
	private UserServiceImpl userServiceImpl;
	
	/**
	 * @param userServiceImpl the userServiceImpl to set
	 */
	@Autowired
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	
	/**
	 * @param tablename is used to retrieve the data from the table
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}")
	ResponseEntity<List<Object[]>> getData(@PathVariable("tablename") String tablename){
		logger.info("getting the list of data from the tablename");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the table");
		List<Object[]> object=userServiceImpl.getData(tablename);
		return ResponseEntity.ok().headers(header).body(object);
	}
	

	/**
	 * @param tablename is used to retrieve the data from the table
	 * @param columnname is used to choose the exact column name
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/asccolumnname/{columnname}")
	ResponseEntity<List<Object[]>> getAscSorting(@PathVariable("tablename") String tablename,@PathVariable("columnname") String asccolumnname){
		logger.info("getting the list of data from the tablename and columnname based on the ascending order"); 
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname by ascending order");
		List<Object[]> object= userServiceImpl.getByAscSorting(tablename,asccolumnname);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
	
	/**
	 * @param tablename is used to retrieve the data from the table
	 * @param desccolumnname is used to choose the exact column name
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/desccolumnname/{columnname}")
	ResponseEntity<List<Object[]>> getDescSorting(@PathVariable("tablename") String tablename,@PathVariable("columnname") String desccolumnname){
		logger.info("getting the list of data from the tablename and columnname by descending order");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname by descending order");
		List<Object[]> object=userServiceImpl.getByDescSorting(tablename,desccolumnname);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
	/**
	 * @param tablename is used to retrieve the data from the table
	 * @param columnname is used to choose the exact column name
	 * @param value is used to pass the value
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/columnnameEqualTo/{columnname}/value/{value}")
	ResponseEntity<List<Object[]>> getByEqualTo(@PathVariable("tablename") String tablename,@PathVariable("columnname") String columnname,@PathVariable("value") String value){
		logger.info("getting the list of data from the tablename and columnname equal to value");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname equal to a value");
		List<Object[]> object= userServiceImpl.getByEqualTo(tablename,columnname,value);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
	/**
	 * @param tablename  is used to retrieve the data from the table
	 * @param columnname is used to choose the exact column name
	 * @param value is used to pass the value
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/columnnameGreaterThan/{columnname}/value/{value}")
	ResponseEntity<List<Object[]>> getByGreaterThan(@PathVariable("tablename") String tablename,@PathVariable("columnname") String columnname,@PathVariable("value") int value){
		logger.info("getting the list of data from the tablename and columnname greater than the value");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname greater than a value");
		List<Object[]> object=userServiceImpl.getByGreaterThan(tablename,columnname,value);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
	/**
	 * @param tablename is used to retrieve the data from the table
	 * @param columnname is used to choose the exact column name
	 * @param value is used to pass the value
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/columnnameLessThan/{columnname}/value/{value}")
	ResponseEntity<List<Object[]>> getByLessThan(@PathVariable("tablename") String tablename,@PathVariable("columnname") String columnname,@PathVariable("value") int value){
		logger.info("getting the list of data from the tablename and columnname less than value");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname less than a value");
		List<Object[]> object=userServiceImpl.getByLessThan(tablename,columnname,value);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
	/**
	 * @param tablename is used to retrieve the data from the table
	 * @param columnname is used to choose the exact column name
	 * @param value is used to pass the value
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/columnnameLike/{columnname}/value/{value}")
	ResponseEntity<List<Object[]>> getByLike(@PathVariable("tablename") String tablename,@PathVariable("columnname") String columnname,@PathVariable("value") String value){
		logger.info("getting the list of data from the tablename and columnname based on like value");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname based on the like ");
		List<Object[]> object=userServiceImpl.getByLike(tablename,columnname,value);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
	/**
	 * @param tablename is used to retrieve the data from the table
	 * @param columnname is used to choose the exact column name
	 * @param value1 is used to pass the first value
	 * @param value2 is used to pass the second value
	 * @return list of data
	 */
	@GetMapping("/tablename/{tablename}/columnnameBetween/{columnname}/value1/{value1}/value2/{value2}")
	ResponseEntity<List<Object[]>> getByBetween(@PathVariable("tablename") String tablename,@PathVariable("columnname") String columnname,@PathVariable("value1") int value1, @PathVariable("value2") int value2){
		logger.info("getting the list of data from the tablename and columnname between value1 and value2");
		HttpHeaders header=new HttpHeaders();
		header.add("desc","returns a list of data based on the tablename and columnname based on between of two values");
		List<Object[]> object= userServiceImpl.getByBetween(tablename,columnname,value1,value2);
		return ResponseEntity.ok().headers(header).body(object);
	}
	
}
