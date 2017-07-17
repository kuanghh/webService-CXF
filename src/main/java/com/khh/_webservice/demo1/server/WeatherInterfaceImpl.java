package com.khh._webservice.demo1.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created by Administrator on 2017/7/7.
 * SEI实现类
 */
@WebService//@WebService表示该类是一个服务类，需要发布其中的public方法
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)  //发布SOAP1.2版本
public class WeatherInterfaceImpl implements WeatherInterface {

    public String queryWeather(String cityName) {

        System.out.println("from client...." + cityName);
        String weahter = "下雨";
        return weahter;
    }
}
