/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
* Click nbfs://nbhhost/SystemFileSystem/Templates/Classes/Classes/Class.java
*/
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Lina#@123");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
