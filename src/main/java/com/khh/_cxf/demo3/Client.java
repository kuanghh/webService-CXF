package com.khh._cxf.demo3;

import com.khh._cxf.demo2.client.WeatherInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Client {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-cxf.xml");
        WeatherInterface weatherInterface = (WeatherInterface) context.getBean("weatherInterface");

        String result = weatherInterface.queryWeather("北京");
        System.out.println(result);
    }
}
