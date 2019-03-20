/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author escobar
 */
public class connexBD {
    public static connexBD data ;
    public Connection con;
    String jdbcDriver ="com.mysql.jdbc.Driver";
    public String user="root";
    public String password="";
    public String url="jdbc:mysql://localhost:3306/cite";
    private connexBD(){
        try {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("connexion etablie");
        } catch (SQLException ex) {
            Logger.getLogger(connexBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connexBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static connexBD getInstance(){
    if(data == null)
        data = new connexBD();
    return data;
        }

    public Connection getCon() {
        return con;
    }

}
