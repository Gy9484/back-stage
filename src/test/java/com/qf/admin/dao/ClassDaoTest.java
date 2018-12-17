package com.qf.admin.dao;

import com.qf.admin.pojo.po.SClass;
import com.qf.admin.pojo.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ClassDaoTest {

    @Autowired
    private ClassDao classDao;

    @Test
    public void testGetClass(){
        SClass sc = classDao.getClass(1806);
        //遍历
        for(Student stu : sc.getList()){
            System.out.println(stu);
        }
    }
}