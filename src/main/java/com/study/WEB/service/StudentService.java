package com.study.WEB.service;

import java.util.List;

import com.study.WEB.model.Student;

public interface StudentService {
    int deleteByPrimaryKey(Integer id);
    int insert(Student record);
    int insertSelective(Student record);
    Student selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Student record);
    int updateByPrimaryKey(Student record);    
}
