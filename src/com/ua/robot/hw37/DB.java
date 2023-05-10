package com.ua.robot.hw37;

import java.sql.*;

public class DB {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) throws Exception {
        try {
            connect();
            selectEx();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main1");
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("INSERT INTO cities (name, country_id) VALUES (?, ?);");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void selectEx() {
        try (ResultSet rs1 = statement.executeQuery("SELECT * FROM countries;")) {
            while (rs1.next()) {
                System.out.println("id: " + rs1.getInt("id") + " Country: " + rs1.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (ResultSet rs2 = statement.executeQuery("SELECT * FROM cities;")) {
            while (rs2.next()) {
                System.out.println("City: " + rs2.getString("name") + " Country_id: " + rs2.getInt("country_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO cities (name, country_id) VALUES ('Chernigov', 1);");
    }

    private static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void dropTableEx() throws SQLException {
        statement.executeUpdate("DROP TABLE cities;");
    }

    public static void clearTableEx() throws SQLException {
        statement.executeUpdate("DELETE FROM cities;");
    }

    public static void deleteEx() throws SQLException {
        statement.executeUpdate("DELETE FROM cities WHERE id = 3;");
    }

    public static void updateEx() throws SQLException {
        statement.executeUpdate("UPDATE cities SET name = 'Nikopol' WHERE id = 1;");
    }

}
