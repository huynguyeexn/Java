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
import ENTITY.Employees;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class EmployeesDAL  extends dataAccessHelper{
    private final String GET_LOGIN="select * from Employees where username=? and password=?";
    public boolean getLogin(String u,String p){
        boolean check=false;
        try {      
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_LOGIN);
            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                check=true;
            }
            getClose();     
        }catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
   
}
