package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.mapper.EmployeeMapper;
import com.atguigu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public List<Employee> get(Integer id) {
        return employeeMapper.get(id);
    }

    @Override
    public void insert(Employee employee) {
        String departmentName = employee.getDepartment();
        System.out.println("==detName==:"+departmentName);
        switch (departmentName){
            case "AA": employee.setDepId(1); break;
            case "BB": employee.setDepId(2); break;
            case "CC": employee.setDepId(3); break;
            case "DD": employee.setDepId(4); break;
        }
        employeeMapper.insert(employee);
    }

    @Override
    public void update(Employee employee) {
        String department = employee.getDepartment();
        System.out.println("==det==:"+department);
        switch (department){
            case "AA": employee.setDepId(1); break;
            case "BB": employee.setDepId(2); break;
            case "CC": employee.setDepId(3); break;
            case "DD": employee.setDepId(4); break;
        }
        employeeMapper.update(employee);
    }

    @Override
    public void delete(Integer id) {
        employeeMapper.delete(id);
    }
}
