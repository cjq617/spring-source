package com.xiangxue.jack.targetSource.cjq;

import org.springframework.aop.target.AbstractBeanFactoryBasedTargetSource;

public class CjqTargetSource extends AbstractBeanFactoryBasedTargetSource {
    @Override
    public Object getTarget() throws Exception {
        return getBeanFactory().getBean(getTargetBeanName());
    }
}
