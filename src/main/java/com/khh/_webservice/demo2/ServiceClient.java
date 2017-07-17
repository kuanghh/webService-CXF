package com.khh._webservice.demo2;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by Administrator on 2017/7/16.
 */
public class ServiceClient {


    public static void main(String[] args) throws MalformedURLException {

        String urlString = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";

        URL url = new URL(urlString);

        String nameSpaceURL = "http://WebXml.com.cn/";
        String localPart = "MobileCodeWS";

        QName qName = new QName(nameSpaceURL,localPart);

        Service service = Service.create(url, qName);

        MobileCodeWSSoap port = service.getPort(MobileCodeWSSoap.class);


        String result = port.getMobileCodeInfo("18927766631", "");

        System.out.println(result);

        ArrayOfString arry = port.getDatabaseInfo();

        List<String> list = arry.getString();
        list.forEach(System.out::println);
    }
}
