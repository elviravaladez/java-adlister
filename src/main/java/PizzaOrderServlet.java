import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");


        System.out.println("-----------------------");
        System.out.println("User Pizza Selection");
        System.out.println("-----------------------");
        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        if (toppings != null) {
            System.out.println("Toppings: ");
            for (String topping : toppings) {
                System.out.println("\t" + topping);
            }
        }
        System.out.printf("Address: %n%s %n%s, %s %s %n",address, city, state, zipcode);



        request.setAttribute("crust", crust);
        request.setAttribute("sauce", sauce);
        request.setAttribute("size", size);
        request.setAttribute("address", address);
        request.setAttribute("city", city);
        request.setAttribute("state", state);
        request.setAttribute("zipcode", zipcode);
        request.setAttribute("toppings", toppings);

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}