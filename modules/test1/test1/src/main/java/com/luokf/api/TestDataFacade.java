package com.luokf.api;

import com.luokf.client.TestDataServiceClient;
import com.luokf.dao.TestDataDAO;
import com.luokf.entity.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2019-08-14 15:53
 * @Author: luokf
 */
@RestController
public class TestDataFacade implements TestDataServiceClient,TestDataServiceApi {

    @Autowired
    private TestDataDAO testDataDAO;

    @Override
    public TestData get(String id) {
        return testDataDAO.getById(id);
    }
}
