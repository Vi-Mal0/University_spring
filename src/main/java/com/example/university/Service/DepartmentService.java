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

    //  view
    public List<Department> viewDepartment(){
        return departmentRepository.findAll();
    }

    public Optional<Department> viewDepartmentById(Long id){
        return departmentRepository.findById(id);
    }

    //  create

    public String addDepartment(Department department){
        departmentRepository.save(department);
        return "department added ";
    }

    //  delete
    public String deleteDepartmentById(Long id){
        departmentRepository.deleteById(id);
        return "data removed";
    }

    public String deleteDepartment(Department department){
        departmentRepository.delete(department);
        return "data removed";
    }

    //  update
    public String updateDepartmentByID(Long id,Department department){
        Department dept = departmentRepository.getById(id);
        if(department.getDept_name() != null){
            dept.setDept_name(department.getDept_name());
        }
        else{
            return "invalid null args";
        }
        departmentRepository.save(dept);
        return "updated successfully";
    }

}
