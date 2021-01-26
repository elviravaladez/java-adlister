import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    //TODO: Define your constructor so that it accepts an
    // instance of your Config class so that it can obtain the
    // database credentials.
    private Connection connection; //private instance property named connection of type Connection

    //Initializing connection in constructor. Constructor accepts an
        // instance of Config class so that it can obtain the
        // database credentials.
    MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //TODO: Your methods should retrieve ads from the database and insert new ads into the database

    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "SELECT * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()) {
                output.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )

                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    //TODO: In your controller, when an ad is being created, hardcode the id into the ad.
    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads(user_id, title, description) VALUES(ad.getUserId(),ad.getTitle(), ad.getDescription())";

        Statement statement = connection.createStatement();
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
    }
}
