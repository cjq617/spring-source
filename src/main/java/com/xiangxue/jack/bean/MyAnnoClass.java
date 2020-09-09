package com.xiangxue.jack.bean;

import com.xiangxue.jack.beanDefinition.MyService;
import lombok.Data;

@Data
@MyService
public class MyAnnoClass {

    public String username = "Jack";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
