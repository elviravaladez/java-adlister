import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessCorrectServlet", urlPatterns = "/correct")
public class GuessCorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userGuess = request.getParameter("userGuess");
        String outcome = "Won";

        request.setAttribute("outcome", outcome);
        request.setAttribute("userGuess", userGuess);

        request.getRequestDispatcher("/guessing-game-app/guessoutcome.jsp").forward(request, response);
    }
}
