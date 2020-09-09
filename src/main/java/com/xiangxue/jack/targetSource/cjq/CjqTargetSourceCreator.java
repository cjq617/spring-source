package com.xiangxue.jack.targetSource.cjq;

import com.xiangxue.jack.targetSource.MyTargetSource;
import org.springframework.aop.framework.autoproxy.target.AbstractBeanFactoryBasedTargetSourceCreator;
import org.springframework.aop.target.AbstractBeanFactoryBasedTargetSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CjqTargetSourceCreator extends AbstractBeanFactoryBasedTargetSourceCreator {
    @Override
    protected AbstractBeanFactoryBasedTargetSource createBeanFactoryBasedTargetSource(Class<?> beanClass, String beanName) {
        BeanFactory beanFactory = getBeanFactory();
        if(getBeanFactory() instanceof ConfigurableListableBeanFactory) {
            BeanDefinition bd = ((ConfigurableListableBeanFactory)beanFactory).getBeanDefinition(beanName);

            if(beanName.equalsIgnoreCase("userServiceImpl1")) {
                return new MyTargetSource();
            }
        }
        return null;
    }
}
