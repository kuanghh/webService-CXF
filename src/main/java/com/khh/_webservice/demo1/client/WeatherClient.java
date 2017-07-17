package com.khh._webservice.demo1.client;

/**
 * Created by Administrator on 2017/7/7.
 * 天气查询客户端
 */
public class WeatherClient {
    public static void main(String[] args) {
        //创建服务视图
        WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
        //获取服务实现类
        WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);

        //调用查询方法，打印
        String weahter = weatherInterfaceImpl.queryWeather("北京");
        System.out.println(weahter);
    }
}
