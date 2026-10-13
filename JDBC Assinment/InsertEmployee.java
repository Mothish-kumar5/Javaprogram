package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "root";

        String sql = "INSERT INTO employee "
                   + "(emp_id, emp_name, department, salary) "
                   + "VALUES (?, ?, ?, ?)";

        try (
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(
                url, user, password
            );
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);
            ps.setDouble(4, salary);

            int rows = ps.executeUpdate();
            System.out.println(
                rows + " employee inserted successfully."
            );

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

