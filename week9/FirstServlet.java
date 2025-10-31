import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get user input
        String name = request.getParameter("username");

        // Create cookie
        Cookie ck = new Cookie("username", name);
        response.addCookie(ck); // Add to response

        out.println("<h3>Cookie Created Successfully!</h3>");
        out.println("<a href='SecondServlet'>Go to Next Servlet</a>");
        out.close();
    }
}
