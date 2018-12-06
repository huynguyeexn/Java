/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import ENTITY.Dichvu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class DichvuDAL extends DataAccessHelper{
private final String GET_BY_ID="select * from Dichvu where dID=?";
private final String GET_ALL="select * from Dichvu";

    private final String ADD_DATA="insert into Dichvu(dID,dName)" + "values (?,?)";
    private final String UPDATE_DATA="Update "+ "Dichvu set dID=?,dName=? where dID=?";
    public ArrayList<Dichvu> getByID(int id) {
        ArrayList<Dichvu> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                Dichvu item=new Dichvu();
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
    
    public ArrayList<Dichvu> getAll(){
        ArrayList<Dichvu> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Dichvu item=new Dichvu();
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
//public boolean AddData(Dichvu dep){
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
//    public boolean UpdateData(Dichvu dep){
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
