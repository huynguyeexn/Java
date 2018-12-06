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

import ENTITY.Theloai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TheloaiDAL extends DataAccessHelper{
    private final String GET_BY_ID="select * from Theloai where tlID=?";
private final String GET_ALL="select * from Theloai";
    public ArrayList<Theloai> getByID(int id) {
        ArrayList<Theloai> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                Theloai item=new Theloai();
                item.setTlID(rs.getInt("tlID"));
                item.setTlName(rs.getString("tlName"));
                objs.add(item);
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
    
    public ArrayList<Theloai> getAll(){
        ArrayList<Theloai> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Theloai item=new Theloai();
                    item.setTlID(rs.getInt("tlID"));
                    item.setTlName(rs.getString("tlName"));
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
