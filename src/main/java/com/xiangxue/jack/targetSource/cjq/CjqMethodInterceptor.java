package com.xiangxue.jack.targetSource.cjq;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;


@Component
public class CjqMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("cjq拦截----------------------------->");
        return invocation.proceed();
    }
}
