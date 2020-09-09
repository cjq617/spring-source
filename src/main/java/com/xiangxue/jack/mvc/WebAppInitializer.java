package com.xiangxue.jack.mvc;

public class WebAppInitializer /*extends AbstractAnnotationConfigDispatcherServletInitializer*/ {

    /*//父容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{SpringContainer.class};
    }

    //SpringMVC配置子容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{MvcContainer.class};
    }

    //获取DispatcherServlet的映射信息
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {

        MyFilter myFilter = new MyFilter();

        return new Filter[]{myFilter};
    }*/
}
