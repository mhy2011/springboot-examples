package com.mhy.springboot.mapper;

import com.mhy.springboot.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: StudentMapperTest
 * @date 2018-09-07 下午8:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Student student = studentMapper.selectByPrimaryKey(1L);
        System.out.println("============================" + student.getName());
    }

    @Test
    public void testInsert() throws Exception {
        Student student = new Student();
        student.setStuNo("20180010003");
        student.setName("李四");
        student.setBirthday(new Date());
        int id = studentMapper.insert(student);
        System.out.println("==================" + id);
    }
}