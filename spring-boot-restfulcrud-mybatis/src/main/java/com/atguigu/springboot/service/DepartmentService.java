package com.atguigu.springboot.service;

import com.atguigu.springboot.entities.Department;

import java.util.Collection;
import java.util.List;

public interface DepartmentService {

    public List<Department> getDepartments();

    public List<Department> getDepartment(Integer id);
}
