package com.tcs;

import java.sql.*;

public class DerbyApp {

    // Embedded Derby DB (creates file-based DB if not found)
    private static final String URL = "jdbc:derby:myEmbeddedDB;create=true";

    public static void main(String[] args) {

        try {
            // 1. Load Derby Driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            System.out.println("Derby Driver Loaded!");

            // 2. Create DB connection
            Connection conn = DriverManager.getConnection(URL);
            System.out.println("Connected to Derby Database!");

            // 3. Create table if not exists
            Statement stmt = conn.createStatement();

            try {
                stmt.executeUpdate("CREATE TABLE USERS (ID INT PRIMARY KEY, NAME VARCHAR(50))");
                System.out.println("Table USERS created!");
            } catch (SQLException e) {
                System.out.println("Table already exists, skipping creation...");
            }

            // 4. Insert record
            PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO USERS VALUES (?,?)");
            insertStmt.setInt(1, 1);
            insertStmt.setString(2, "Alice");
            insertStmt.executeUpdate();
            System.out.println("Record Inserted!");

            // 5. Retrieve data
            ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
            System.out.println("\n==== Data From USERS Table ====");
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " | " + rs.getString("NAME"));
            }

            // 6. Close connection
            conn.close();
            System.out.println("\nConnection Closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}