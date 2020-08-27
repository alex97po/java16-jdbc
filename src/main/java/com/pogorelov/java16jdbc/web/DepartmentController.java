package com.pogorelov.java16jdbc.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pogorelov.java16jdbc.domain.Department;
import com.pogorelov.java16jdbc.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = "/departments")
public class DepartmentController extends HttpServlet {

    private final ServiceFactory serviceFactory =  new ServiceFactory();
    private final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processGetRequest(req, resp);
    }

    private void processGetRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
        if (request.getParameterMap().containsKey("id")) {
            Long departmentId = Long.parseLong(request.getParameter("id"));
            Department department = serviceFactory.getDepartmentService().findDepartmentById(departmentId);
            writer.println(objectMapper.writeValueAsString(department));
        } else {
            List<Department> departmentList = serviceFactory.getDepartmentService().getAllDepartments();
            request.setAttribute("departments", departmentList);
            request.getRequestDispatcher("department-list.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Department department = new Department();
        department.setName(req.getParameter("name"));
        serviceFactory.getDepartmentService().createDepartment(department);
        resp.sendRedirect("/api/departments");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
        Long departmentId = Long.parseLong(req.getParameter("id"));
        serviceFactory.getDepartmentService().deleteDepartment(departmentId);
        resp.setStatus(204);
    }
}
