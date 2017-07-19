package com.khh._cxf.rest.server;

import com.khh._cxf.rest.pojo.Student;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Created by Administrator on 2017/7/19.
 */
public class StudentServer {

    public static void main(String[] args) {
        //使用JAXRSServerFactoryBean发布REST服务
        JAXRSServerFactoryBean restBean = new JAXRSServerFactoryBean();

        //3个参数，1：服务实现类；2.设置资源类；3.设置服务地址

        restBean.setServiceBean(new StudentInterfaceImpl());

        //添加会涉及到的使用类
        //如果有多个资源类，可以用","隔开
        //restBean.setResourceClasses(Student.class,StudentInterfaceImpl.class,StudentInterface.class);
        //因为 StudentInterfaceImpl里面有Student.class和StudentInterface.class，所以就设置一个
        //StudentInterfaceImpl就可以了，cxf会自动扫描其它的
        restBean.setResourceClasses(StudentInterfaceImpl.class);

        restBean.setAddress("http://127.0.0.1:12345/user");

        restBean.create();
    }
}
