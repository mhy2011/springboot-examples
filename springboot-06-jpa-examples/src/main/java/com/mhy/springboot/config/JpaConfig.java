package com.mhy.springboot.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author mahaiyuan
 * @ClassName: JpaConfig
 * @date 2018-08-20 下午1:55
 */
@EnableJpaRepositories(basePackages = {"com.mhy.springboot.dao"})
public class JpaConfig {
}
