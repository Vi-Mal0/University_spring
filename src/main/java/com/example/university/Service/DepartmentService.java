package com.example.university.Service;

import com.example.university.Entity.Department;
import com.example.university.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> viewDepartment(){
        return departmentRepository.findAll();
    }

    public Optional<Department> viewDepartmentById(Long id){
        return departmentRepository.findById(id);
    }

    public String addDepartment(Department department){
        departmentRepository.save(department);
        return "department added ";
    }

    public String deleteDepartmentById(Long id){
        departmentRepository.deleteById(id);
        return "data removed";
    }

}
