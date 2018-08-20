package com.mhy.springboot.repository;

import com.mhy.springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mahaiyuan
 * @ClassName: PersonRepository
 * @date 2018-08-15 下午11:19
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
