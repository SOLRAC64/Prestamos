package com.mycompany.prestamos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author carlos
 */
public class ClienteDAO {

//    private Connection conn = null;
//    private Statement statement = null;
//
//    private String databaseURL = "jdbc:derby:booksdb;create=true";
    public ClienteDAO() {

//        try {
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            conn = DriverManager.getConnection("jdbc:derby:;shutdown=true");
//            conn = DriverManager.getConnection(databaseURL);
//            statement = conn.createStatement();

//            String sql = "CREATE TABLE book (book_id int primary key, title varchar(128))";
//            statement.execute(sql);
//
//            sql = "INSERT INTO book VALUES (1, 'Effective Java'), (2, 'Core Java')";
//            statement.execute(sql);
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
    }

    public static void main(String[] args) {
        try {
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String databaseURL = "jdbc:derby:booksdb;create=true";
            Connection conn = DriverManager.getConnection(databaseURL);
//        ClienteDAO cDAO = new ClienteDAO();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } //catch (ClassNotFoundException ex) {
            //ex.printStackTrace();
        //}

    }

}
