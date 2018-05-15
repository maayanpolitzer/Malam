package server;

import server.database.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AuthServlet", urlPatterns = "/Auth")
public class AuthServlet extends HttpServlet {

    // logout
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        response.sendRedirect("index.jsp?action=logout");
    }

    // login
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        String action = request.getParameter("action");
        if (action != null && action.equals("login")) {
        */
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            // validate from DB...
//            if (username.equals("Admin") && password.equals("123")) {
        if(DbConnection.validateUser(username, password)){
                // OK.
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
//                response.sendRedirect("main.jsp");    // display the JSP file (without using servlet).
                response.sendRedirect("/Main");
            } else {
                response.sendRedirect("index.jsp?action=error");
            }
        /*
        } else {
            HttpSession session = request.getSession();
            session.removeAttribute("username");
            session.invalidate();
            response.sendRedirect("index.jsp?action=logout");
        }
        */
    }

}
