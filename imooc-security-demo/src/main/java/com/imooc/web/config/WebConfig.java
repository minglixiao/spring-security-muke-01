package com.imooc.web.config;

import com.imooc.web.interceptor.TimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *  配置Interceptor拦截器。
 *  */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    // 将我们写的拦截器注入进来
    @Autowired
    private TimeInterceptor timeInterceptorMy;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 将我们的拦截器添加到InterceptorRegistry
        // registry.addInterceptor(timeInterceptorMy);
    }
}