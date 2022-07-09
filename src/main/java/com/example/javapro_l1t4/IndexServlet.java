package com.example.javapro_l1t4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/result")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String food = request.getParameter("user_food");

        String res = name + " " + surname + " ordered " + food;
        TextResult.newText(res);

        response.sendRedirect("/");

    }
}
