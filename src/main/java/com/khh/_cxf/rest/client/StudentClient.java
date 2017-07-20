package com.khh._cxf.rest.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by FSTMP on 2017/7/20.
 */
public class StudentClient {
    public static String address = "http://127.0.0.1:12345/user";

    public static void main(String[] args) throws Exception{

        findStudent(12L,address + "/student/query");
        findStudentList("张三",address + "/student/queryList");
    }

     public static void findStudent(Long id,String path) throws Exception{

         URL url = new URL(path + "/" + id);
         find(url,"GET");

    }

    public static  void  findStudentList(String name,String path) throws Exception{
        URL url = new URL(path + "/" + name);
        find(url,"GET");
    }

    private static void find(URL url ,String method) throws Exception{
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();

        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod(method);
        connection.setRequestProperty("content-type","application/xml");

        if(connection.getResponseCode() == 200){
            InputStream in = connection.getInputStream();
            int len = -1;
            byte[] buff = new byte[1024];
            while((len = in.read(buff)) != -1){
                System.out.println(new String(buff,0,len,"UTF-8"));
            }
        }
    }
}
