package com.pogorelov.java16jdbc.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("userName");
       String password = req.getParameter("userPass");
       resp.setContentType("text/html");
       if (name.equals(password)) {
           RequestDispatcher requestDispatcher = req.getRequestDispatcher("/hello");
           requestDispatcher.forward(req, resp);
       } else {
           PrintWriter out = resp.getWriter();
           out.println("Sorry, user not found by username and password");
           RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
           requestDispatcher.include(req, resp);
       }
    }
}
