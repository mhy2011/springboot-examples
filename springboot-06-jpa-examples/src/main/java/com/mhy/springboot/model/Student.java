package com.mhy.springboot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author mahaiyuan
 * @ClassName: Student
 * @date 2018-08-20 下午1:52
 */
@Data
@Entity
public class Student {
    @Id
    private long id;
    private String name;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
