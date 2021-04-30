package com.ahai.service.impl;

import com.ahai.dao.DepDao;
import com.ahai.pojo.Dept;
import com.ahai.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepServiceImpl implements DepService {

    @Autowired
    private DepDao depDao;

    @Override
    public boolean addDept(Dept dept) {
        return depDao.addDept(dept);
    }

    @Override
    public Dept queryById(int id) {
        return depDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return depDao.queryAll();
    }
}
