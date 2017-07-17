package com.khh._webservice.demo3;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2017/7/16.
 */
public class HttpURLConnectionClient {

    public static void main(String[] args) throws IOException {

        String urlString = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";

        URL url = new URL(urlString);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestMethod("POST");

        urlConnection.setRequestProperty("content-type","text/xml;charset=UTF-8");

        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);

        OutputStream out = urlConnection.getOutputStream();

        String soapXML = getXML("18927766631");

        out.write(soapXML.getBytes());

        if(urlConnection.getResponseCode() == 200){
            InputStream in = urlConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder sb = new StringBuilder();
            String temp = null;
            while(null != (temp = reader.readLine())){
                sb.append(temp);
            }
            System.out.println(sb.toString());

            reader.close();
            in.close();

        }

        out.close();
    }

    public static String getXML(String phoneNum){
        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                +"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                +"<soap:Body>"
                +"<getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">"
                +"<mobileCode>"+phoneNum+"</mobileCode>"
                +"<userID></userID>"
                +"</getMobileCodeInfo>"
                +"</soap:Body>"
                +"</soap:Envelope>";
        return soapXML;
    }
}
