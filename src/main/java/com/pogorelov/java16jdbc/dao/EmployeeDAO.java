package com.pogorelov.java16jdbc.dao;

import com.pogorelov.java16jdbc.domain.Employee;

public class EmployeeDAO extends GenericDAO<Employee, Long> {

    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }
}
