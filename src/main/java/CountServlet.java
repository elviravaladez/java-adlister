import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// TODO: Create a page that displays a number that goes up by one every time the /count page is viewed.
@WebServlet(name = "PageCounterServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html"); //setting content type
        counter++;
        PrintWriter out = response.getWriter(); //write out to the browser

        String count_query = request.getParameter("count_query");

        if(count_query == null) {
            count_query = String.valueOf(counter);
        }

        if(count_query.equals("1")) {
            out.println("<h1>This page has been visited " + count_query + " time.</h1>");
        } else {
            out.println("<h1>This page has been visited " + count_query + " times.</h1>");
        }
    }
}
