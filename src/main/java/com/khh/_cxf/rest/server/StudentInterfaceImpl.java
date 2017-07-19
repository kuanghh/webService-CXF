package com.khh._cxf.rest.server;

import com.khh._cxf.rest.pojo.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 */
public class StudentInterfaceImpl implements StudentInterface{


    @Override
    public Student query(Long id) {
        Student st = new Student();
        st.setId(id);
        st.setName("张三");
        st.setBirthday(new Date());
        return st;
    }

    @Override
    public List<Student> query(String name) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"李四",new Date());
        Student s2 = new Student(2,"超人",new Date());
        Student s3 = new Student(3,"咸蛋",new Date());
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }
}
