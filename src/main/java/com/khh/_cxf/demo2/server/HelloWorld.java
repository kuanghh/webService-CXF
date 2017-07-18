package com.khh._cxf.demo2.server;

import javax.jws.WebService;

/**
 * Created by Administrator on 2017/7/18.
 */
@WebService
public class HelloWorld {

    public String say(String name){
        return "hello," + name;
    }
}
