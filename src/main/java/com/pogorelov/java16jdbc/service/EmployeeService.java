package com.pogorelov.java16jdbc.service;

import com.pogorelov.java16jdbc.dao.EmployeeDAO;
import com.pogorelov.java16jdbc.domain.Employee;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeDAO employeeDAO;

    public List<Employee> findAllEmployees() {
        return employeeDAO.findAll();
    }

}
