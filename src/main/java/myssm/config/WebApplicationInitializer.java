package myssm.config;

import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends
    AbstractAnnotationConfigDispatcherServletInitializer {

    // 指定 Spring 应用上下文配置类（主要配置 web 组件的 Bean）
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    // 相对应的另一个应用上下文配置类（应用中的其他 Bean）
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    // 将 DispatcherServlet 映射到 "/"
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 编码过滤器
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter("UTF-8", true);
        return new Filter[]{encodingFilter};
    }
}