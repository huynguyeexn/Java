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

import ENTITY.Tacgia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TacgiaDAL extends DataAccessHelper{
private final String GET_BY_ID="select * from tacgia where tgID=?";
private final String GET_ALL="select * from tacgia";
    public ArrayList<Tacgia> getByID(int id) {
        ArrayList<Tacgia> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                Tacgia item=new Tacgia();
                item.setTgID(rs.getInt("tgID"));
                item.setTgName(rs.getString("tgName"));
                objs.add(item);
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
    
    public ArrayList<Tacgia> getAll(){
        ArrayList<Tacgia> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Tacgia item=new Tacgia();
                    item.setTgID(rs.getInt("tgID"));
                    item.setTgName(rs.getString("tgName"));
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
