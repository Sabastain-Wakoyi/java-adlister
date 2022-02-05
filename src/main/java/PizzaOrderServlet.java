import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

//        String crust = request.getParameter("crustType");
//        String sauce = request.getParameter("sauceType");
//        String size = request.getParameter("size");
//        String pepper = request.getParameter("pepper soup");
//        String sausage = request.getParameter("sausage");
//        String address = request.getParameter("address");
//        System.out.println(crust);
//        System.out.println(size);
//        System.out.println(pepper);
//        System.out.println(sausage);
//        System.out.println(address);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // GET PARAMETERS FOR PIZZA
        String crust = request.getParameter("crustType");
        String sauce = request.getParameter("sauceType");
        String size = request.getParameter("size");
        String pepper = request.getParameter("pepper-soup");
        String sausage = request.getParameter("sausage");
        String address = request.getParameter("address");
        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        System.out.println(pepper);
        System.out.println(sausage);
        System.out.println(address);

        // CREATE BRIDGE WITH DISPATCH REQUEST
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
//        response.sendRedirect("/pizza-order");
    }
}