package com.ahai.service;

import com.ahai.pojo.Dept;

import java.util.List;

public interface DepService {
    public boolean addDept(Dept dept);

    public Dept queryById(int id);

    public List<Dept> queryAll();
}
