package com.atguigu.springboot.mapper;

import java.util.Collection;
import java.util.List;

import com.atguigu.springboot.entities.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface EmployeeMapper {

    public List<Employee> getAll();

    public List<Employee> get(@Param("id") Integer id);

    public void insert(Employee employee);

    public void update(Employee employee);

    public void delete(Integer id);
}