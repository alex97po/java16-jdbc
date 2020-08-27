package com.pogorelov.java16jdbc.dao;

import com.pogorelov.java16jdbc.domain.Department;

public class DepartmentDAO extends GenericDAO<Department, Long> {

    @Override
    public Class<Department> getEntityClass() {
        return Department.class;
    }
}
