import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse Response) throws ServletException, IoException {

        response.setContentTType("text/html");
        PrintWriter out=response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body></html>");
    }
}
