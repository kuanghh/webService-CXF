package com.khh._cxf.rest.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/19.
 * 学生实体类
 */
@XmlRootElement(name="student")//@XmlRootElement可以实现对象和XML数据之间的转换
public class Student {
    private long id;

    private String name;

    private Date birthday;

    public Student(){

    }

    public Student(long id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
