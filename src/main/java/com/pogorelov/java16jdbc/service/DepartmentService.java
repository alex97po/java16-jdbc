package com.pogorelov.java16jdbc.service;

import com.pogorelov.java16jdbc.dao.DepartmentDAO;
import com.pogorelov.java16jdbc.domain.Department;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentDAO departmentDAO;

    public Department findDepartmentById(Long id) {
        return departmentDAO.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Department not found by id "+ id));
    }

    public void createDepartment(Department department) {
        departmentDAO.save(department);
    }

    public void deleteDepartment(Long id) {
        departmentDAO.delete(id);
    }

    public List<Department> getAllDepartments() {
        return departmentDAO.findAll();
    }
}
