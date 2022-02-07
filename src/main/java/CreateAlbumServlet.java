import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/albums/create")
public class CreateAlbumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/albums/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Albums albumsDao = DaoFactory.getAlbumsDao();
        String name = req.getParameter("name");
        String artist = req.getParameter("artist");
        int releaseDate = Integer.parseInt(req.getParameter("releaseDate"));
        float sales = Float.parseFloat(req.getParameter("sales"));
        String genre = req.getParameter("genre");
        long id = 1;
        for (Album album : albumsDao.all()) {
            if (album.getId() > id) {
                id = album.getId() + 1;
            }
        }
        Album newRecord = new Album(id, artist, name, releaseDate, sales, genre);
        albumsDao.insert(newRecord);
        resp.sendRedirect("/albums");
    }
}