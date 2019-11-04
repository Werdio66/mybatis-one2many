package com._520.mybatis;

import com._520.mybatis.mapper.Department;
import com._520.mybatis.mapper.DepartmentMapper;
import com._520.mybatis.mapper.Employee;
import com._520.mybatis.util.MybatisUtil;
import org.junit.Test;

public class App {
    @Test
    public void get(){
        DepartmentMapper departmentMapper = MybatisUtil.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.get(10L);
        System.out.println(department);
        for (Employee list:department.getEmployees()
             ) {
            System.out.println(list);
        }
    }
}
