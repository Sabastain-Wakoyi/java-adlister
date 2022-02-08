import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileLecServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().setAttribute("isDarkMode", true);

        request.getSession().invalidate();


        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }
}