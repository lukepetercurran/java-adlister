import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if(name == null) {
            out.println("<h1 style=\'color:hotpink;\'>Hello, World!</h1>");
        } else {
            out.println("<h1 style=\'color:hotpink;\'> Hello, " + name + "!</h1>");
        }
    }





    @WebServlet(name = "PageRefreshCounter", urlPatterns = "/count")
    public class PageRefreshCounter extends HttpServlet {
        int counter = 1;
        @Override
                protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException){
    resp.setContentType("text/html");
    PrintWriter anyName = resp.getWriter();
    if (req.getParamter("reset") != null){
        counter = 1;
            }
    anyName.println("You have view this page ");

       }
    }
}


