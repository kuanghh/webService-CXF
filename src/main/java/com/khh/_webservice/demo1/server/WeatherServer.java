package com.khh._webservice.demo1.server;

import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2017/7/7.
 * 天气服务端
 */
public class WeatherServer {

    public static void main(String[] args) {

        //Endpoint发布服务，publish方法，两个参数：1.服务地址；2.服务实现类
        String address = "http://127.0.0.1:12345/weather";
        WeatherInterfaceImpl weatherInterface = new WeatherInterfaceImpl();
        Endpoint.publish(address,weatherInterface);

    }
}
