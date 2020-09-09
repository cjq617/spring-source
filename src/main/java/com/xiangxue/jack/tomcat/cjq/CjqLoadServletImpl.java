package com.xiangxue.jack.tomcat.cjq;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * 参考 AbstractDispatcherServletInitializer
 */
public class CjqLoadServletImpl implements CjqLoadServlet {
    /**
     * 增加servlet到servlet容器
     * @param servletContext
     */
    @Override
    public void onStartup(ServletContext servletContext) {
        ServletRegistration.Dynamic servlet = servletContext.addServlet("init", "com.xiangxue.jack.servlet.InitServlet");
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/init");
    }
}
