package com.avinty.hr.service;

import com.avinty.hr.entity.Department;

import java.util.List;

public interface DepartmentService {

    void deleteDepartment(Long id);


    List<Department> searchDepartment(String name);

    List<Department> getAllDepartment();
}
