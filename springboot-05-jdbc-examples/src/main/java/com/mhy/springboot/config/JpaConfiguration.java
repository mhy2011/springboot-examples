package com.mhy.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author mahaiyuan
 * @ClassName: JpaConfiguration
 * @date 2018-08-15 下午11:21
 */
@Configuration
@EnableJpaRepositories("com.mhy.springboot.repository")
public class JpaConfiguration {
}
