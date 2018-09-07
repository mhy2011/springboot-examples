package com.mhy.springboot.dao;

import com.mhy.springboot.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: StudentRepositoryTest
 * @date 2018-08-20 下午1:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testSave() {
        Student student = new Student(100L, "学生100");
        Student result = studentRepository.save(student);
        System.out.println(result);
    }
}