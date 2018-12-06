/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import ENTITY.Khachhang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class KhachhangDAL extends DataAccessHelper {
private final String GET_LOGIN="select * from KHACHHANG where username=? and password=?";
    private final String GET_ALL="select * from KHACHHANG";
    private final String ADD_DATA="insert into KHACHHANG(username,password,fullname,age,address,phone,cmnd,pID,dID)" + "values (?,?,?,?,?,?,?,?,?)";
    private final String UPDATE_DATA="Update "+ "KHACHHANG set username=?,password=?,fullname=?,age=?,address=?,phone=?,pID=?,dID=? where username=?";
    private final String DELETE_DATA="DELETE  "+ "KHACHHANG where username=?";
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
    public ArrayList<Khachhang> getALL(){
        ArrayList<Khachhang> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Khachhang item=new Khachhang();
                    item.setUsername(rs.getString("username"));
                    item.setPassword(rs.getString("password"));
                    item.setFullname(rs.getString("fullname"));
                    item.setAge(rs.getString("age"));
                    item.setAddress(rs.getString("address"));
                    item.setPhone(rs.getString("phone"));
                    item.setCmnd(rs.getString("cmnd"));
                    item.setpID(rs.getInt("pID"));
                    item.setdID(rs.getInt("dID"));
                    objs.add(item);
                }
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        } 
        return objs;
    }
    public boolean AddData(Khachhang s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(ADD_DATA);
            ps.setString(1, s.getUsername());
            ps.setString(2,s.getPassword());
            ps.setString(3, s.getFullname());
            ps.setString(4,s.getAge());
            ps.setString(5,s.getAddress());
            ps.setString(6,s.getPhone());
            ps.setString(7, s.getCmnd());
            ps.setInt(8,s.getpID());
            ps.setInt(9,s.getdID());
            int rs=ps.executeUpdate();
            if(rs>0){
                check=true;
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
    public boolean UpdateData(Khachhang s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(UPDATE_DATA);
            ps.setString(1, s.getUsername());
            ps.setString(2, s.getPassword());
            ps.setString(3, s.getFullname());
            ps.setString(4,s.getAge());
            ps.setString(5,s.getAddress());
            ps.setString(6,s.getPhone());
            ps.setInt(7,s.getpID());
            ps.setInt(8,s.getdID());
            ps.setString(9, s.getUsername());
            int rs=ps.executeUpdate();
            if(rs>0){
                check=true;
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
    public boolean DeteleData(Khachhang s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(DELETE_DATA);
            ps.setString(1, s.getUsername());
            int rs=ps.executeUpdate();
            if(rs>0){
                check=true;
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
    
}
