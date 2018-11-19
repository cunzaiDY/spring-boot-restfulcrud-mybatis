package com.atguigu.springboot.mapper;

import java.util.Collection;
import java.util.List;

import com.atguigu.springboot.entities.Department;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface DepartmentMapper {
	
	public List<Department> getDepartments();

	public List<Department> getDepartment(Integer id);
}
