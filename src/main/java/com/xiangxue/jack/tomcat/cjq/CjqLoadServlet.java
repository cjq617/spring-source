package com.xiangxue.jack.tomcat.cjq;

import javax.servlet.ServletContext;

/**
 * 参考 WebApplicationInitializer
 */
public interface CjqLoadServlet {

    void onStartup(ServletContext servletContext);
}
