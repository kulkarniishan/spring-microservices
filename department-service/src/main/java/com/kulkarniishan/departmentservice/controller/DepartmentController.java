package com.kulkarniishan.departmentservice.controller;

import com.kulkarniishan.departmentservice.entity.Department;
import com.kulkarniishan.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController!");
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable("departmentId") Long departmentId){
        log.info("Inside getDepartment method of DepartmentController!");
        return departmentService.getDepartmentById(departmentId);
    }
}
