package com.novauc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;



















    public class MainTest {
        public Connection startConnection() throws SQLException {
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
            Main.createTables(conn);
            return conn;
        }

    @Test
    public void testUser() throws SQLException {
        Connection conn = startConnection();
        Main.insertUser(conn, "Alice", "");
        User user = Main.selectUser(conn, "Alice");
        conn.close();
        assertTrue(user != null);
    }


    @Test
    public void testMessage() throws SQLException {
        Connection conn = startConnection();
        Main.insertUser(conn, "Alice", "");
        User user = Main.selectUser(conn, "Alice");
        Main.insertMessage(conn, user.id, -1, "Hello, world!");
        Message message = Main.selectMessage(conn, 1);
        conn.close();
        assertTrue(message != null);
    }
}






