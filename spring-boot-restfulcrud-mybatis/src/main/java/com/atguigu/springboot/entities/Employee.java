package com.atguigu.springboot.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {

	private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private String department;
    private Date birth;

    private Integer depId;
	
}
