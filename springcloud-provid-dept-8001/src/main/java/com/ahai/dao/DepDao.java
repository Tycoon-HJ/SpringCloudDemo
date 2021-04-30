package com.ahai.dao;

import com.ahai.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@Mapper
public interface DepDao {

    public boolean addDept(Dept dept);

    public Dept queryById(int id);

    @Select("select * from dept")
    public List<Dept> queryAll();

}
