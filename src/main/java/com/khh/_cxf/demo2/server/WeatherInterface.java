package com.khh._cxf.demo2.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created by Administrator on 2017/7/17.
 * SEI接口
 */
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {

    String queryWeather(String cityName);
}
