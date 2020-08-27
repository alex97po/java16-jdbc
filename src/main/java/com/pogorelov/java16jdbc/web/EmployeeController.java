package com.pogorelov.java16jdbc.web;

import com.pogorelov.java16jdbc.domain.Employee;
import com.pogorelov.java16jdbc.service.ServiceFactory;
import lombok.RequiredArgsConstructor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/employees")
public class EmployeeController extends HttpServlet {

    private final ServiceFactory serviceFactory = new ServiceFactory();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameterMap().containsKey("id")) {
            throw new UnsupportedOperationException();
        } else {
            List<Employee> employees = serviceFactory.getEmployeeService().findAllEmployees();
            req.setAttribute("employees", employees);
            req.getRequestDispatcher("employee-list.jsp").forward(req, resp);
        }
    }
}
