package com.mhy.springboot.dao;

import com.mhy.springboot.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @author mahaiyuan
 * @ClassName: StudentRepository
 * @date 2018-08-20 下午1:54
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

}
