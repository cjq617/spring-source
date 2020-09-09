package com.xiangxue.jack.mvc.cjq;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(value = "com.xiangxue.jack", excludeFilters = {
        @ComponentScan.Filter(type=FilterType.ANNOTATION, classes = {Controller.class})
})
public class CjqSpringContainer {
}
