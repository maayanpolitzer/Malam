package com.malam.servlets;

import com.malam.connectors.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/next")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int answerId = Integer.parseInt(request.getParameter("answer_id"));
        int questionId = Integer.parseInt(request.getParameter("question_id"));
        int score = 0;
        HttpSession session = request.getSession();
        Object scoreAsString = session.getAttribute("score");
        if(scoreAsString != null){
            //score = Integer.parseInt((String)scoreAsString);
            score = (int)scoreAsString;
        }

        if(DbConnection.getInstance().getAnswerId(questionId) == answerId){

            session.setAttribute("score", ++score);
        }else{
            session.setAttribute("score", score);
        }
        System.out.println("scroe: " + score);

        if(DbConnection.getInstance().isLastQuestion(questionId)){
            response.sendRedirect("/gameOver.jsp");
        }else{
            response.sendRedirect("/question?id=" + (questionId+1));
        }
    }
}
