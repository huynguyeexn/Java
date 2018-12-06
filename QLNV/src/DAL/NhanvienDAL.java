/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import ENTITY.Nhanvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class NhanvienDAL extends DataAccessHelper{
     private final String GET_LOGIN="select * from NHANVIEN where nvID=?";
    private final String GET_ALL="select * from NHANVIEN";
    private final String ADD_DATA="insert into NHANVIEN(nvID,fullname,age,address,phone,pID,dID)" + "values (?,?,?,?,?,?,?)";
    private final String UPDATE_DATA="Update "+ "NHANVIEN set nvID=?,fullname=?,age=?,address=?,phone=?,pID=?,dID=? where nvID=?";
    private final String DELETE_DATA="DELETE  "+ "NHANVIEN where nvID=?";
    public boolean getLogin(String u){
        boolean check=false;
        try {      
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_LOGIN);
            ps.setString(1, u);
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
    public ArrayList<Nhanvien> getALL(){
        ArrayList<Nhanvien> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Nhanvien item=new Nhanvien();
                    item.setNvID(rs.getInt("nvID"));
                    item.setFullname(rs.getString("fullname"));
                    item.setAge(rs.getString("age"));
                    item.setAddress(rs.getString("address"));
                    item.setPhone(rs.getString("phone"));
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
    public boolean AddData(Nhanvien s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(ADD_DATA);
            ps.setInt(1, s.getNvID());
            ps.setString(2, s.getFullname());
            ps.setString(3,s.getAge());
            ps.setString(4,s.getAddress());
            ps.setString(5,s.getPhone());
            ps.setInt(6,s.getpID());
            ps.setInt(7,s.getdID());
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
    public boolean UpdateData(Nhanvien s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(UPDATE_DATA);
            ps.setInt(1, s.getNvID());
            ps.setString(2, s.getFullname());
            ps.setString(3,s.getAge());
            ps.setString(4,s.getAddress());
            ps.setString(5,s.getPhone());
            ps.setInt(6,s.getpID());
            ps.setInt(7,s.getdID());
            ps.setInt(8, s.getNvID());
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
    public boolean DeteleData(Nhanvien s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(DELETE_DATA);
            ps.setInt(1, s.getNvID());
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
