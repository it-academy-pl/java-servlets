package pl.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name="welcomeServlet", urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {
    private String message;
    @Override
    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World servlet";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><body><h1>Hello World</h1>");
        out.println("<p>The time is : " + new Date() + "</p>");
        out.println("</body></html>");
        out.close();
    }
    @Override
    public void destroy() {
        // do nothing.
    }
}
