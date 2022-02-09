import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

import javax.servlet.jsp.jstl.core.Config;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MySQLAdsDao implements Ads {
    private Connection connection;

    //creating a constructor
    public MySQLAdsDao() {
        //surround in a try catch
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.SQL_DATA_SOURCE,
                    Config.SQL_DATA_SOURCE,
                    Config.SQL_DATA_SOURCE
            );
            System.out.println("database connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    //retrieve ads from the database
    public List<Ad> all() {
        // create a new list to return from the method - as we pull out from JDBC we put into this array list of ads

        //Query to send to the JDBC
        String query = "SELECT * FROM ads";
        try {
            List<Ad> output = new ArrayList<>();
            //creating a statement object through the connection object
            Statement st = connection.createStatement();
            // create a result set of the results from our query and pass it our query
            ResultSet rs = st.executeQuery((query));
            //going through the result set and creating an ad from each output item
            while (rs.next()) {
                output.add(new Ad(
                        //using getLong because that is the data type of the ID vice versa for getString
                        rs.getLong(1),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
                System.out.println("id");
            }
            return output;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //insert ads into the interface
    @Override
    public Long insert(Ad ad) {
        Long lastInsertedId = 0L;
        String query = String.format(
                "INSERT INTO ads (user_id, title, description) VALUES(%d, '%s', '%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lastInsertedId;
    }

    //@Override
    public boolean delete(long id) {
        return false;
    }
}
























//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.sql.DriverManager;
//import com.mysql.cj.jdbc.Driver;
//
//import javax.servlet.jsp.jstl.core.Config;
//
//
//public class MySQLAdsDao implements Ads {
//    private Connection connection;
//    private Config config = new Config();
//    //    public MySQLAdsDao(String url, String user, String password) {};
//    public MySQLAdsDao() {
//
//        try {
////            DriverManager.registerDriver(new Driver());
//            new Driver();
//            this.connection = DriverManager.getConnection (
//                    config.toString(),
//                    config.toString(),
//                    config.toString()
//            );
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//    }
//
//
//    public List<Ad> all() throws SQLException {
//        String selectQuery = "SELECT * FROM ads";
//
//        ResultSet resultSet = null;
//
//        Statement statement = connection.createStatement();
//        resultSet = statement.executeQuery(selectQuery);
//
//        List<Ad> ads = new ArrayList<>();
//
//        while (resultSet.next()) {
//            System.out.printf("""
//                     %s
//                    %s
//                    %s
//                    """, resultSet.getLong("id"), resultSet.getString("title"), resultSet.getString("description"));
//        }
//        return null;
//    }
//
//    @Override
//    public Long insert(Ad ad) {
//        return null;
//    }
//
//};