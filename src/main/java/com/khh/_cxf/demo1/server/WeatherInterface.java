package com.khh._cxf.demo1.server;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017/7/17.
 * SEI接口
 */
@WebService
public interface WeatherInterface {

    String queryWeather(String cityName);
}
