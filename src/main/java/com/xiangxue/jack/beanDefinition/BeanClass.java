package com.xiangxue.jack.beanDefinition;

import lombok.Data;

@Data
public class BeanClass {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
