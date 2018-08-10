package com.mhy.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mahaiyuan
 * @ClassName: User
 * @date 2018-08-11 上午12:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private String gender;
}
