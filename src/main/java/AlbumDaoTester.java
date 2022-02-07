import java.util.List;

public class AlbumDaoTester {
    public static void main(String[] args) {
        Albums albumsDao = DaoFactory.getAlbumsDao();
        List<Album> albums = albumsDao.all();
        for (Album album : albums) {
            System.out.printf("One of my favorite albums is \"%s\" by the music act %s, which has sold %.2f million copies.%n", album.getName(), album.getArtist(), album.getSales());
        }
    }
}