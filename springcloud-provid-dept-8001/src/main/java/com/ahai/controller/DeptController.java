package com.ahai.controller;

import com.ahai.pojo.Dept;
import com.ahai.service.DepService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    @Resource
    private DepService depService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        System.out.println(dept);
       // boolean blean = depService.addDept(dept);
        return true;
    }

    @GetMapping("/dept/{id}")
    public Dept queryById(@PathVariable int id){
        return depService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return depService.queryAll();
    }

}
