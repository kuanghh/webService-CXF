
package com.khh._webservice.demo1.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherInterfaceImpl", targetNamespace = "http://demo1._webservice.khh.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://demo1._webservice.khh.com/", className = "com.khh._webservice.demo1.client.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://demo1._webservice.khh.com/", className = "com.khh._webservice.demo1.client.QueryWeatherResponse")
    @Action(input = "http://demo1._webservice.khh.com/WeatherInterfaceImpl/queryWeatherRequest", output = "http://demo1._webservice.khh.com/WeatherInterfaceImpl/queryWeatherResponse")
    public String queryWeather(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

}
