package server;

import server.database.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@WebServlet(name = "UsersServlet", urlPatterns = "/Users")
public class UsersServlet extends HttpServlet {

    private List<String> list = new Vector<>();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("working");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(DbConnection.createUser(username, password)){
            response.sendRedirect("Main?action=user_created");
        }else{
            response.sendRedirect("Main?action=user_error");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
