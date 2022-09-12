package com.kulkarniishan.departmentservice.service;

import com.kulkarniishan.departmentservice.entity.Department;
import com.kulkarniishan.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService!");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("Inside getDepartment method of DepartmentService!");
        return departmentRepository.getReferenceById(departmentId);
    }
}
