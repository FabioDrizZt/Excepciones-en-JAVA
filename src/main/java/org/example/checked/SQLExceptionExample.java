package org.example.checked;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_db", "usuario", "contraseña");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tabla_inexistente");
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }
}
