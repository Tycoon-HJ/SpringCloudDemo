package com.ahai.springcloud1.controller;

import com.ahai.pojo.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DetConsumerController {


    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;


    @RequestMapping("/consumer/dept/{id}")
    public Dept get(@PathVariable("id") int id){
       return restTemplate.getForObject(REST_URL_PREFIX+"/dept/"+id,Dept.class);
    }


    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/add"+"?dname={dname}",boolean.class,dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
