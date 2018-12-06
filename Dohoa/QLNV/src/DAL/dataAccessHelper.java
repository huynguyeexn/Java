/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Huy
 */
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dataAccessHelper {
    protected Connection con;
    String HostName="DESKTOP-D4U9M24";
    String sqlInstanceName = "SQLEXPRESS";
    String port="1433";
    String dbName="QLS_java";
    String use="sa";
    String pass="123";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String URL="jdbc:sqlserver://" + HostName + ":" + port + ";database=" + dbName;
    public void getConnect(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(URL, use, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getClose(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(dataAccessHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
