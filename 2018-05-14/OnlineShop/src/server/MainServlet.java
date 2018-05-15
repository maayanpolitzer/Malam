package server;

import server.database.DbConnection;
import server.model.Item;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainServlet extends HttpServlet {

//    private List<Item> items; // testing.

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        /*
        items = new ArrayList<>();
        items.add(new Item("Milk", 4.9));
        items.add(new Item("Bread", 8.9));
        */
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("items", items);
        String action = (String)request.getParameter("action");
        request.setAttribute("items", DbConnection.getAllItems());
        getServletContext().getRequestDispatcher("/main.jsp?action=" + action).forward(request, response);
    }
}
