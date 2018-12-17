package com.qf.admin.dao;

import com.qf.admin.pojo.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {

    @Autowired
//    @Resource(name="studentDao2")
    private StudentDao studentDao;
    
    @Test
    public void testGetStudentById(){
        Student result = studentDao.getStudentById(3);
        System.out.println(result);

    }
}