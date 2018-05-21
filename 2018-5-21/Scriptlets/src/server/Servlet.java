package server;

import server.Dog;
import server.Owner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "server.Servlet", urlPatterns = "/server")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dog d1 = new Dog("Bree", 5, new Owner("Maayan", "123123"));
        request.setAttribute("dog", d1);
        //request.setAttribute("owner", o1);
        request.getServletContext().getRequestDispatcher("/myDog.jsp").forward(request, response);
    }
}
