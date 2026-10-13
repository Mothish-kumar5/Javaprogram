package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateSalary {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "root";

        String sql = "UPDATE employee SET salary = ? "
                   + "WHERE emp_id = ?";

        try (
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(
                url, user, password
            );
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Salary updated successfully.");
            } else {
                System.out.println("Employee ID not found.");
            }

            System.out.println("Number of records updated: " + rows);

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
