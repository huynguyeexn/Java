/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import ENTITY.Duan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class DuanDAL  extends DataAccessHelper {
    private final String GET_BY_ID="select * from DUAN where dID=?";
private final String GET_ALL="select * from DUAN";
    public ArrayList<Duan> getByID(int id) {
        ArrayList<Duan> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                Duan item=new Duan();
                item.setdID(rs.getInt("dID"));
                item.setdName(rs.getString("dName"));
                objs.add(item);
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
    
    public ArrayList<Duan> getAll(){
        ArrayList<Duan> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Duan item=new Duan();
                    item.setdID(rs.getInt("dID"));
                    item.setdName(rs.getString("dName"));
                    objs.add(item);
                }
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
}
