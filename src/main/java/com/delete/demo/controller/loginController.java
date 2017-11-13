package com.delete.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginController extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
        String name = request.getParameter("user-name");
        String password = request.getParameter("user-password");
        response.sendRedirect("/index");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

    }
}
