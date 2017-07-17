package com.khh._cxf.demo2.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-17T20:56:13.928+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "WeatherInterfaceService", 
                  wsdlLocation = "http://127.0.0.1:1234/weather?wsdl",
                  targetNamespace = "http://server.demo2._cxf.khh.com/") 
public class WeatherInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.demo2._cxf.khh.com/", "WeatherInterfaceService");
    public final static QName WeatherInterfacePort = new QName("http://server.demo2._cxf.khh.com/", "WeatherInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:1234/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:1234/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WeatherInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WeatherInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WeatherInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfacePort")
    public WeatherInterface getWeatherInterfacePort() {
        return super.getPort(WeatherInterfacePort, WeatherInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfacePort")
    public WeatherInterface getWeatherInterfacePort(WebServiceFeature... features) {
        return super.getPort(WeatherInterfacePort, WeatherInterface.class, features);
    }

}
