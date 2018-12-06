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
import ENTITY.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SachDAL extends DataAccessHelper{
 private final String GET_LOGIN="select * from Sach where sID=?";
    private final String GET_ALL="select * from Sach";
    private final String ADD_DATA="insert into Sach(sID,tensach,namxb,ngaynhap,soluong,dongia,tgID,tlID)" + "values (?,?,?,?,?,?,?,?)";
    private final String UPDATE_DATA="Update "+ "Sach set sID=?,tensach=?,namxb=?,ngaynhap=?,soluong=?,dongia=?,tgID=?,tlID=? where sID=?";
    private final String DELETE_DATA="DELETE  "+ "Sach where sID=?";
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
    public ArrayList<Sach> getALL(){
        ArrayList<Sach> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Sach item=new Sach();
                    item.setsID(rs.getInt("sID"));
                    item.setTenSach(rs.getString("tensach"));
                    item.setNamXB(rs.getInt("namxb"));
                    item.setNgayNhap(rs.getString("ngaynhap"));
                    item.setSoLuong(rs.getInt("soluong"));
                    item.setDonGia(rs.getInt("dongia"));
                    item.setTgID(rs.getInt("tgID"));
                    item.setTlID(rs.getInt("tlID"));
                    objs.add(item);
                }
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        } 
        return objs;
    }
    public boolean AddData(Sach s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(ADD_DATA);
            ps.setInt(1, s.getsID());
            ps.setString(2, s.getTenSach());
            ps.setInt(3,s.getNamXB());
            ps.setString(4,s.getNgayNhap());
            ps.setInt(5,s.getSoLuong());
            ps.setInt(6,s.getDonGia());
            ps.setInt(7,s.getTgID());
            ps.setInt(8,s.getTlID());
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
    public boolean UpdateData(Sach s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(UPDATE_DATA);
            ps.setInt(1, s.getsID());
            ps.setString(2, s.getTenSach());
            ps.setInt(3,s.getNamXB());
            ps.setString(4,s.getNgayNhap());
            ps.setInt(5,s.getSoLuong());
            ps.setInt(6,s.getDonGia());
            ps.setInt(7,s.getTgID());
            ps.setInt(8,s.getTlID());
            ps.setInt(9, s.getsID());
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
    public boolean DeteleData(Sach s){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(DELETE_DATA);
            ps.setInt(1, s.getsID());
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
