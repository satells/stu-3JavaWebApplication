package org.o7planning.simplewebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("@@@@@@@@@@HomeServlet: " + Thread.currentThread().getName());
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/homeView.jsp");
	dispatcher.forward(request, response);

    }

}
