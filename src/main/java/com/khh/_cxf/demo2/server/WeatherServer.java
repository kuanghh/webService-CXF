package com.khh._cxf.demo2.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by Administrator on 2017/7/17.
 * 发布SOAP1.2服务类
 *
 */
public class WeatherServer {

    public static void main(String[] args) {

        //JaxWsServerFactoryBean发布，设置3个参数，1.服务接口；2.服务实现类；3.服务地址；
        //endpoint仅支持发布实现类，JaxWsServerFactoryBean支持发布接口。

        //JaxWsServerFactoryBean发布服务
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();

        //设置服务接口
        jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);

        //设置服务实现类
        jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());

        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:1234/weather");

        jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());


        //发布
        jaxWsServerFactoryBean.create();
    }
}
