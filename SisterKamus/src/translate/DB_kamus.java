/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class DB_kamus {
    public String driver = "com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://localhost/db_kamus";
    public String username = "root";
    public String password = "";
    public Connection con;
    
     public DB_kamus()
    {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_kamus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DB_kamus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection()
    {
        return con;
    }
    public static void main(String[] args) {
        System.out.println(new DB_kamus().getConnection());
    }
}
