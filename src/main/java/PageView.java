import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageView", urlPatterns = "/count")
public class PageView extends HttpServlet {
    public int counter;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        Boolean needReset = req.getParameter("needReset").equalsIgnoreCase("yes");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            Boolean needReset = req.getParameter("needReset").equalsIgnoreCase("yes");

            if (needReset){
                counter = 0;
                resp.sendRedirect("/count");
            }
        } catch (NullPointerException npe){
            counter++;
            out.println("<h1>Your page has been viewed: " + counter + " time(s)</h1>");
        }


//        counter++;
//        out.println("<h1>Your page has been viewed: " + counter + " time(s)</h1>");
    }
}