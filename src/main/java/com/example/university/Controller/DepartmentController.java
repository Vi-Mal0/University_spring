package com.example.university.Controller;

import com.example.university.Entity.Department;
import com.example.university.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("viewDepartment")
    public List<Department> viewDept(){
        return departmentService.viewDepartment();
    }

    @GetMapping("viewDepartment/{id}")
    public Optional<Department> viewDeptById(@PathVariable("id")Long dept_id){
        return departmentService.viewDepartmentById(dept_id);
    }

    @PostMapping("addDepartment")
    public String addDept(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @DeleteMapping("deleteDepartment/{id}")
    public String delDeptById(@PathVariable("id") Long dept_id){
        return departmentService.deleteDepartmentById(dept_id);
    }

}
