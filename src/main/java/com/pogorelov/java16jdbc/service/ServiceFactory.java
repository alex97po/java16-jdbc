package com.pogorelov.java16jdbc.service;

import com.pogorelov.java16jdbc.dao.DepartmentDAO;
import com.pogorelov.java16jdbc.dao.EmployeeDAO;

public class ServiceFactory {

    public DepartmentService getDepartmentService() {
        return new DepartmentService(new DepartmentDAO());
    }

    public EmployeeService getEmployeeService() {
        return new EmployeeService(new EmployeeDAO());
    }
}
