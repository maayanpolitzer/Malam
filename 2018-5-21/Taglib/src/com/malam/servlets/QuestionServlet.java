package com.malam.servlets;

import com.malam.connectors.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestionServlet", urlPatterns = "/question")
public class QuestionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("question", DbConnection.getInstance().getQuestion(id));
        request.setAttribute("answers", DbConnection.getInstance().getPossibleAnswers(id));
        request.getServletContext().getRequestDispatcher("/question.jsp").forward(request, response);
    }
}
