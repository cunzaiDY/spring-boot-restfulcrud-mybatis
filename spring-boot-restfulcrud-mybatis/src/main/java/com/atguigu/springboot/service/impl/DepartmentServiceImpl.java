package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }

    @Override
    public List<Department> getDepartment(Integer id) {
        return departmentMapper.getDepartment(id);
    }
}
