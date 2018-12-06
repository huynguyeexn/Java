/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import ENTITY.Phong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class PhongDAL extends DataAccessHelper{
    private final String GET_BY_ID="select * from Phong where pID=?";
private final String GET_ALL="select * from Phong";

    private final String ADD_DATA="insert into Phong(pID,pName)" + "values (?,?)";
    private final String UPDATE_DATA="Update "+ "Phong set pID=?,pName=? where pID=?";
    public ArrayList<Phong> getByID(int id) {
        ArrayList<Phong> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                Phong item=new Phong();
                item.setpID(rs.getInt("pID"));
                item.setpName(rs.getString("pName"));
                item.setDongia(rs.getString("dongia"));
                objs.add(item);
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
    
    public ArrayList<Phong> getAll(){
        ArrayList<Phong> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Phong item=new Phong();
                    item.setpID(rs.getInt("pID"));
                    item.setpName(rs.getString("pName"));
                item.setDongia(rs.getString("dongia"));
                    objs.add(item);
                }
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
//public boolean AddData(Phong dep){
//        boolean check=false;
//        try{
//            getConnect();
//            PreparedStatement ps=con.prepareStatement(ADD_DATA);
//            ps.setInt(1, dep.getDepID());
//            ps.setString(2, dep.getDepName());
//            int rs=ps.executeUpdate();
//            if(rs>0){
//                check=true;
//            }
//            getClose();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return check;
//    }
//    public boolean UpdateData(Phong dep){
//        boolean check=false;
//        try{
//            getConnect();
//            PreparedStatement ps=con.prepareStatement(UPDATE_DATA);
//            ps.setInt(1, dep.getDepID());
//            ps.setString(2, dep.getDepName());
//            int rs=ps.executeUpdate();
//            if(rs>0){
//                check=true;
//            }
//            getClose();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return check;
//    }
}
