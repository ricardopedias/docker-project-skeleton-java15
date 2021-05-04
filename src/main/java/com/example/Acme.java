package com.example;

// Jakarta Servlet 5.0 API
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/acme")
public class Acme extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<h1>Exemplo Servlet </h1>");

        out.println("<p>");
        out.println("Este é um servlet, para acessar uma página jsp, ");
        out.println("<a href=\"index.jsp\">clique aqui</a>");
        out.println("</p>");
    }
}