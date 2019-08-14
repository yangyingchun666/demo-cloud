/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.luokf.service;

import com.luokf.dao.TestDataDAO;
import com.luokf.entity.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试数据Service
 * @author ThinkGem
 * @version 2018-04-22
 */
@Service
public class TestDataService {
	
	@Autowired
	private TestDataDAO testDataDAO;


	public TestData getById(String id) {
		return testDataDAO.getById(id);
	}

}