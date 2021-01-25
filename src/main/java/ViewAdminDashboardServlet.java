import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewAdminDashboardServlet", urlPatterns = "/admin")
public class ViewAdminDashboardServlet extends HttpServlet {
    //TODO: CHECK FOR ADMIN STATUS

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        //Getting attribute for "isAdmin" and saving it to a boolean variable isAdmin
        boolean isAdmin = (boolean) session.getAttribute("isAdmin"); //casting because it isAdmin stored as a generic Object

        //Making sure that if user is NOT an admin it redirects them back to JUST the profile page.
        //Not letting them access admin page
        if(isAdmin == false) {
            //user path
            response.sendRedirect("/profile");
            return; //have to include a return when using JUST an IF-STATEMENT
        }

        request.getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response); //you HAVE TO have .jsp in getRequestDispatcher or you will have issues
    }
}
