package cn.michael.springbootweb.config;

import cn.michael.springbootweb.filter.MyFilter;
import cn.michael.springbootweb.listener.MyListener;
import cn.michael.springbootweb.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletRegistration;
import java.util.Arrays;

@Configuration
public class MyServerConfig {
    //register servlet
    @Bean
    public ServletRegistrationBean<MyServlet> myServlet(){
        ServletRegistrationBean<MyServlet> registrationBean = new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter> myFilter(){
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener(){
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return registrationBean;
    }
}
