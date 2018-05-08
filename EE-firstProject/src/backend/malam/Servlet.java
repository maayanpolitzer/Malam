package backend.malam;

import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "Servlet", urlPatterns = "/server")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null){
            sb.append(line);
        }
        JSONObject output = new JSONObject();
        try {
            JSONObject input = new JSONObject(sb.toString());
            //String name = input.getString("name");
            //int age = input.getInt("age");
            Person p1 = new Person(input);
            showPerson(p1);


            output.put("response", true);

        } catch (JSONException e) {
            e.printStackTrace();
            try {
                output.put("response", false);
                output.put("message", e.getMessage());
            } catch (JSONException e1) {
                e1.printStackTrace();
            }

        }

        response.setContentType("application/json");
        response.getWriter().write(output.toString());

    }

    private void showPerson(Person person) {
        System.out.println(person);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get");
        String name = request.getParameter("name");
        response.getWriter().write("Hello " + name);
    }


}
