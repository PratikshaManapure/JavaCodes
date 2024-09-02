import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeJDBC {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/p"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established.");

            // Insert multiple employee data
            String insertQuery = "INSERT INTO employee (id, name, salary, age) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertQuery);

            // Employee 1
            pstmt.setInt(1, 2344);
            pstmt.setString(2, "Pratiksha");
            pstmt.setInt(3, 2000);
            pstmt.setInt(4, 20);
            pstmt.addBatch();

            // Employee 2
            pstmt.setInt(1, 2345);
            pstmt.setString(2, "Rutika");
            pstmt.setInt(3, 300);
            pstmt.setInt(4, 28);
            pstmt.addBatch();

            // Employee 3
            pstmt.setInt(1, 2346);
            pstmt.setString(2, "Aayushi");
            pstmt.setInt(3, 1000);
            pstmt.setInt(4, 32);
            pstmt.addBatch();

            // Employee 4
            pstmt.setInt(1, 2347);
            pstmt.setString(2, "Tanushree");
            pstmt.setInt(3, 200);
            pstmt.setInt(4, 35);
            pstmt.addBatch();

            //Employee 5
            pstmt.setInt(1, 2346);
            pstmt.setString(2, "Sakshi");
            pstmt.setInt(3, 400);
            pstmt.setInt(4, 30);
            pstmt.addBatch();

            // Execute the batch
            pstmt.executeBatch();
            System.out.println("Multiple employee records inserted successfully.");

            // Display all employee data
            String selectQuery = "SELECT * FROM employee";
            pstmt = conn.prepareStatement(selectQuery);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                int age = rs.getInt("age");

                System.out.println("Employee Details:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
                System.out.println("Age: " + age);
                System.out.println("---------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
