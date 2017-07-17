package com.khh._cxf.demo2.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by Administrator on 2017/7/17.
 */
public class WeatherClient {

    public static void main(String[] args) {

        //jaxWsProxyFactoryBean调用服务端
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();

        //设置服务接口
        jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
        //设置服务地址
        jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:1234/weather?wsdl");

        //获取服务接口实例
        WeatherInterface weatherInterface = jaxWsProxyFactoryBean.create(WeatherInterface.class);

        //调用查询方法
        String w = weatherInterface.queryWeather("东京");
        System.out.println(w);
    }
}
