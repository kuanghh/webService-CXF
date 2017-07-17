package com.khh._cxf.demo2.server;

/**
 * Created by Administrator on 2017/7/17.
 * 服务实现类
 */
public class WeatherInterfaceImpl implements WeatherInterface {
    public String queryWeather(String cityName) {
        System.out.println(cityName);
        if("北京".equals(cityName)){
            return "高温且暴雨";
        }else{
            return "低温且暴雨";
        }
    }
}
