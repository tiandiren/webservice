package com.example.demo.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.ws.AppService;
import com.example.demo.ws.impl.AppServiceImpl;

@Configuration
public class CxfConfig {
    //默认servlet路径/*,如果覆写则按照自己定义的来
    /*@Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }*/

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    //把实现类交给spring管理
    @Bean
    public AppService appService() {
        return new AppServiceImpl();
    }

    //终端路径
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), appService());
        endpoint.publish("/user");
        return endpoint;
    }
}