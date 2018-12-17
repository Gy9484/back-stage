package com.qf.admin.dao;

import com.qf.admin.pojo.po.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    Student getStudentById(int id);
}
