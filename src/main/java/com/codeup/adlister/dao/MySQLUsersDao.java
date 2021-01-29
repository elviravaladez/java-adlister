package com.codeup.adlister.dao;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String sqlQuery = "SELECT * FROM users WHERE username LIKE ?";
        String theUsername = "%" + username + "%";
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.setString(1, theUsername);
            stmt.executeQuery();

            ResultSet rs = stmt.getResultSet();

            if(rs.next()) {
                return new User(
                     rs.getLong("id"),
                     rs.getString("username"),
                     rs.getString("email"),
                     rs.getString("password")
                );
            } else {
                return null;
            }

        } catch(SQLException e) {
            throw new RuntimeException("Error finding username!", e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    private String createInsertQuery(User user) {
        return "INSERT INTO users(id, username, email, password) VALUES "
                + "(" + user.getId() + ", "
                + "'" + user.getUsername() +"', "
                + "'" + user.getEmail() +"', "
                + "'" + user.getPassword() + "')";
    }
}
