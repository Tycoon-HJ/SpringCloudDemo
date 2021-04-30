package com.ahai.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)     //链式写法
public class Dept implements Serializable { //orm 对象关系映射

    private int id;
    private String dname;
    private String db_source;
}
