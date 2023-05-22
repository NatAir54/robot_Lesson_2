package com.ua.robot.hw38;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
           connect();
           // buildTable(Student.class);
            insertEx();
            selectEx();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    // method for creating a table in database for class Student
    public static void buildTable(Class cl) throws SQLException {
        if (!cl.isAnnotationPresent(Table.class)) {
            throw new RuntimeException("@Table missed");
        }
        Map<Class, String> hm = new HashMap<>();
        hm.put(int.class, "INTEGER");
        hm.put(String.class, "TEXT");
        // CREATE TABLE students (id INTEGER, firstName TEXT, lastName TEXT, age INTEGER) ;
        StringBuilder stringBuilder = new StringBuilder("CREATE TABLE ");
        stringBuilder.append(((Table)cl.getAnnotation(Table.class)).title());
        stringBuilder.append(" (");

        Field[] fields = cl.getDeclaredFields();
        for (Field o : fields) {
            if (o.isAnnotationPresent(Column.class)) {
                stringBuilder.append(o.getName())
                        .append(" ")
                        .append(hm.get(o.getType()))
                        .append(", ");
            }
        }
        stringBuilder.setLength(stringBuilder.length() - 2);
        stringBuilder.append(");");

        statement.executeUpdate(stringBuilder.toString());
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (id, firstName, lastName, age) VALUES (6, 'Bob6','Marmalade', 22);");
    }

    private static void selectEx() {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM students;")) {
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id") + " Name: " + rs.getString("firstName")
                 + " LastName: " + rs.getString("lastName") + " Age: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
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

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:main1");
            statement = connection.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }
    public static void dropTableEx() throws SQLException {
        statement.executeUpdate("DROP TABLE students;");
    }

    public static void clearTableEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students;");
    }

    public static void deleteEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students WHERE id = 4;");
    }
}
