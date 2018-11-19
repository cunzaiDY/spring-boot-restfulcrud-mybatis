package com.atguigu.springboot.config;

import com.atguigu.springboot.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//配置类
@Configuration
public class MyConfig implements WebMvcConfigurer {

    //配置路径映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                //配置路径映射，当发起浏览器某个请求后，spring内部默认调用某个路径
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/main.html").setViewName("/dashboard");
                registry.addViewController("/index.html").setViewName("login");
            }

            //配置拦截器

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor())
                        //配置拦截哪些请求
                        .addPathPatterns("/**")
                        //配置放行哪些请求
                        .excludePathPatterns("/","/user/login","/index.html"
                        ,"/static/**","/asserts/**","/webjars/**");
            }
        };
        return webMvcConfigurer;
    }
}
