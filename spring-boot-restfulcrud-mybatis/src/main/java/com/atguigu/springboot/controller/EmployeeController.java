package com.atguigu.springboot.controller;

import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.mapper.EmployeeMapper;
import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.service.DepartmentService;
import com.atguigu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/emps")
    public String getEmp(Model model){
        //查询所有员工
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("emps",employees);
        //查出所有部门信息，然后可以在前端页面按id取出部门号
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/list";
    }

    //来到添加员工页面
    @GetMapping("/emp")
    public String addEmpPage(Model model){
        //查询所有部门信息
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //添加员工
    @PostMapping(value = "/emp")
    public String addEmp(Employee employee,Model model){
        employeeService.insert(employee);
        System.out.println("添加的员工:"+employee);
        //查出所有部门信息，然后可以在前端页面按id取出部门号
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "redirect:/emps";
    }

    //来到修改页面
    @GetMapping(value = "/emp/{id}")
    public String updateEmpPage(@PathVariable("id") Integer id,
                                Model model){
        //按id查出员工信息
        List<Employee> employee = employeeService.get(id);
        model.addAttribute("emps",employee);
        //查出所有部门信息，然后可以在前端页面按id取出部门号
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        System.out.println("来到修改页面");
//        return "success";
        return "emp/update";
    }

    //修改员工
    @PutMapping(value = "/emp")
    public String updateEmp(Employee employee){
        employeeService.update(employee);
        System.out.println("修改的员工："+employee);
        return "redirect:/emps";
    }

    //删除员工
    @DeleteMapping(value = "/emp/{id}")
    public String delete(@PathVariable("id") Integer id){
        employeeService.delete(id);
        System.out.println("删除成功");
        return "redirect:/emps";
    }

}
