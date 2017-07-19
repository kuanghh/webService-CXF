package com.khh._cxf.rest.server;

import com.khh._cxf.rest.pojo.Student;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 * SEI接口
 */
@WebService
@Path("/student")//@Path("/student")就是将请求路径中的“/student”映射到接口上
public interface StudentInterface {

    /**
     * 查询单个学生
     * @param id
     * @return
     */
    @GET    //指定请求方式，如果服务端发布的时候指定的是GET（POST），那么客户端访问时必须使用GET（POST）
    @Produces(MediaType.APPLICATION_XML) //指定服务数据类型
    @Path("/query/{id}")//@Path("/query/{id}")就是将“/query”映射到方法上，“{id}”映射到参数上，多个参数，以“/”隔开，放到“{}”中
    Student query(@PathParam("id")Long id);

    /**
     * 查询多个学生
     * @param name
     * @return
     */
    @GET
    @Produces("application/json;charset=utf-8")
//    @Produces(MediaType.APPLICATION_JSON)这个会出现乱码
    @Path("/queryList/{name}")
    List<Student> query(@PathParam("name") String name);

}
