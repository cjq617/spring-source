package com.xiangxue.jack.tomcat.cjq;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Set;

/**
 * 在META-INF/services/java.servlet.ServletContainerInitializer文件下配置此类路径，
 * 在tomcat启动时，会调到此类的onStartup方法，并且扫描“CjqLoadServlet.class”的所有实现类，
 * 封装成set参数，在onStartup方法里，循环调用子类的onStartup方法完成servlet的初始化
 *
 * 参考SpringServletContainerInitializer
 */
@HandlesTypes(CjqLoadServlet.class)
public class CjqServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        if(set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Class<?> cla = (Class<?>)it.next();
                if(!cla.isInterface() && !Modifier.isAbstract(cla.getModifiers()) && CjqLoadServlet.class.isAssignableFrom(cla)) {
                    try {
                        ((CjqLoadServlet)cla.newInstance()).onStartup(servletContext);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
