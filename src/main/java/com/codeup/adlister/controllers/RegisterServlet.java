package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: show the registration form
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // TODO: ensure the submitted information is valid
        if (username.equals("") || null == username || email.equals("") || email == null || password.equals("") || password == null) {
            response.sendRedirect("/register");
            return;
        }

        // TODO: create a new user based off of the submitted information
        User user = new User(
                username,
                email,
                password
        );

        // TODO: if a user was successfully created, send them to their profile
        try {
            DaoFactory.getUsersDao().insert(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("/profile");
    }
}
