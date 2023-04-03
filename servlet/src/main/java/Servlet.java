import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        String feeling = req.getParameter("feeling");
        String place = req.getHeader("place");

        name = (name == null) ? "John Dou" : name;
        feeling = (feeling == null) ? "happy" : feeling;
        place = (place == null) ? "London" : place;


        writer.println("Hello");
    }
}
