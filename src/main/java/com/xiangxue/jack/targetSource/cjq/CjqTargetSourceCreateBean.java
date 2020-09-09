package com.xiangxue.jack.targetSource.cjq;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
public class CjqTargetSourceCreateBean {

    @Autowired
    private BeanFactory beanFactory;

    @Bean
    public AnnotationAwareAspectJAutoProxyCreator proxyCreator() {
        AnnotationAwareAspectJAutoProxyCreator creator = new AnnotationAwareAspectJAutoProxyCreator();
        CjqTargetSourceCreator targetSourceCreator = new CjqTargetSourceCreator();
        targetSourceCreator.setBeanFactory(beanFactory);
        creator.setCustomTargetSourceCreators(targetSourceCreator);
        creator.setInterceptorNames("cjqMethodInterceptor");
        return creator;
    }
}
